import org.apache.spark.SparkConf

object wholefile {
  val sparkConf = new SparkConf()
      .setAppName("Sprk Application")
      .setMaster("local")                         //> sparkConf  : org.apache.spark.SparkConf = org.apache.spark.SparkConf@fe18270
                                                  //| 
}