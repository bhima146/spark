package com.bhima

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext
import org.apache.spark.sql.SQLContext
import org.apache.spark.rdd.RDD
import org.apache.spark.sql.functions._

object BridgeFile {
  val conf = new SparkConf()
    .setAppName("BridgeFile")
    .setMaster("local")
  val sc = new SparkContext(conf)

  val sqlContext = new SQLContext(sc)

  val path = "data/data.txt"
  val minPartitions = 1

  case class Names(id: Int, name: String)

  def main(args: Array[String]): Unit = {

    import sqlContext.implicits._

    /*val names = sc
      .textFile(path, minPartitions)
      .map(_.split(' ')).map(_.toSeq)
      .toDF()*/

    val df = sqlContext.read.format("csv").option("sep", ",").load(path).toDF("id", "s", "name")

    //val df = sqlContext.createDataFrame(nam

    df.filter((col("s").isNull) || (col("s").isin(""))).show()
    df.filter((col("s").isNotNull) || !(col("s").isin(""))).show()

    /*names.coalesce(1).
      write.format("csv")
      .option("header", true)
      .option("sep", "|")
      .save("myfile1.txt")*/
  }

}