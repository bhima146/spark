import org.apache.spark.SparkConf

object wholefile {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(151); 
  val sparkConf = new SparkConf()
      .setAppName("Sprk Application")
      .setMaster("local");System.out.println("""sparkConf  : org.apache.spark.SparkConf = """ + $show(sparkConf ))}
}
