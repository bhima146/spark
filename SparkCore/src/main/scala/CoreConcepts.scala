import org.apache.spark.SparkConf
import org.apache.spark.SparkContext

/*
 * This class describes all spark basic concepts
 */

object CoreConcepts {

  val minPartitions = 1
  var sparkConf: SparkConf = _
  var sc: SparkContext = _

  def main(args: Array[String]): Unit = {
    sparkConf = new SparkConf()
      .setAppName("Sprk Application")
      .setMaster("local")

    sc = new SparkContext(sparkConf)

    val baseRdd = sc.textFile("file:///F:/workspace_scala/SparkCore/data/data.txt", minPartitions)

    //val mapRdd = baseRdd.map { _.split("\\s") }

    print(baseRdd.filter(_.trim().isEmpty()).count())
  }
}