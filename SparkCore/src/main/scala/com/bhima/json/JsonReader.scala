package com.bhima.json

//import org.apache.spark.SparkConf
//import org.apache.spark.SparkContext
//import org.apache.spark.SparkConf
//import org.apache.spark.sql.SQLContext
import org.apache.spark.sql.SparkSession

object JsonReader {
  /*val conf: SparkConf = new SparkConf()
    .setAppName("JSONReader")
    .setMaster("local")
  val sc: SparkContext = new SparkContext(conf)
  
  val sqlContext: SQLContext = new SQLContext(sc)*/

  val warehouseLocation = "file:/F:/workspace_scala/SparkCore/spark-warehouse"

  val sparkSession = SparkSession
    .builder()
    .appName("Json Reader")
    .master("local")
    .config("spark.sql.warehouse.dir", warehouseLocation)
    //.enableHiveSupport()
    .getOrCreate()

  val jsonFile = "file:/D:/dataets/hadoop_datasets/SampleData/new.jsonl"

  def main(args: Array[String]): Unit = {
    val jsonDF = sparkSession.read.json(jsonFile);

    jsonDF.persist()
    jsonDF.show()
    jsonDF.printSchema()
    
    jsonDF.createOrReplaceTempView("people")
    
    sparkSession.sql("select * from people").show()
    
    val confMap = sparkSession.conf.getAll
    
    for(map <- confMap){
      printf("(key, value): %s\n",map)
    } 

  }
}