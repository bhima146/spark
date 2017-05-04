package com.bhima.xml

import org.apache.spark.sql.SparkSession

object XMLReader {

  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder()
      .appName(getClass.getSimpleName)
      .master("local")
      .config("spark.sql.warehouse.dir", "spark-warehouse")
      .getOrCreate()
    val baseRdd = spark.sparkContext.wholeTextFiles("data/xml/")
      .map(x => x._2.split("</book>"))
      .map(_.mkString(",") + "</book>")
      .map(str => if (str.contains("?>") || str.contains("catalog>")) replce(str) else str)
    println("output")
    baseRdd.collect().foreach(println)
  }

  def replce(str: String): String = {
    var string: String = str
    if (str.contains("""<?xml version="1.0"?>""")) {
      string = str.replace("""<?xml version="1.0"?>""", "")
    }
    if (str.contains("<catalog>")) {
      string = str.replace("<catalog>", "")
    }
    if (str.contains("</catalog>")) {
      string = str.replace("</catalog>", "")
    }
    string
  }
}