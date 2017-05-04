import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.functions._
object DfJoins {
  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder().appName("DF Joins").master("local").getOrCreate()

    val t1 = spark.read.format("csv").option("sep", "|").load("data/t1").toDF("a", "b", "c")
    val t2 = spark.read.format("csv").option("sep", "|").load("data/t2").toDF("c", "d")
    
    
    
    val metro:(String => String) = (x => x.split('-')(1))
    val sqlFunc = udf(metro)
    
    val t3 = t2.withColumn("d",sqlFunc(col("d"))).show()
    
    //t1.join(t2,Seq("c"),"left_outer").show()
  }
}