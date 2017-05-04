import java.text.SimpleDateFormat
import java.text.DateFormat
import scala.language.implicitConversions

object dateUtil extends App {
  val fromFormat = new SimpleDateFormat("MM/dd/yyyy hh:mm")
  val toFormat = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss")

  val date = "10/05/2016 10:45"
  
  println(toQdate(date))

  def toQdate(x: String):String = toFormat.format(fromFormat.parse(x))

}