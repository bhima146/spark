package com.bhima

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext

object WordCount {
  val conf = new SparkConf()
    .setAppName("BridgeFile")
    .setMaster("local")
  val sc = new SparkContext(conf)
  
  val ls = List("one","one","one","two","a","b")
  
  def main(args:Array[String]):Unit={
    sc.parallelize(ls).map(x => (x,1)).reduceByKey(_+_).collect().foreach {println}
  }
}