import xml._

object test {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(329); 
val data:Elem  = <book id="bk101">
		<author>Gambardella, Matthew</author>
		<title>XML Developer's Guide</title>
		<genre>Computer</genre>
		<price>44.95</price>
		<publish_date>2000-10-01</publish_date>
		<description>An in-depth look at creating applications
			with XML.
		</description>
	</book>;System.out.println("""data  : scala.xml.Elem = """ + $show(data ));$skip(86); 
	
	val elements = Array("book","author","title","price","publish_date","description");System.out.println("""elements  : Array[String] = """ + $show(elements ));$skip(31); 
	
	val nodeSeq: NodeSeq = data;System.out.println("""nodeSeq  : scala.xml.NodeSeq = """ + $show(nodeSeq ));$skip(14); val res$0 = 
	
	data.label;System.out.println("""res0: String = """ + $show(res$0));$skip(25); 
	val book = data \"book";System.out.println("""book  : scala.xml.NodeSeq = """ + $show(book ));$skip(36); 
  book.iterator.foreach { println };$skip(590); 
 
 
 val str = """<book id="bk101">
		<author>Gambardella, Matthew</author>
		<title>XML Developer's Guide</title>
		<genre>Computer</genre>
		<price>44.95</price>
		<publish_date>2000-10-01</publish_date>
		<description>An in-depth look at creating applications
			with XML.
		</description>
	</book>
	<book id="bk101">
		<author>Gambardella, Matthew</author>
		<title>XML Developer's Guide</title>
		<genre>Computer</genre>
		<price>44.95</price>
		<publish_date>2000-10-01</publish_date>
		<description>An in-depth look at creating applications
			with XML.
		</description>
	</book>""";System.out.println("""str  : String = """ + $show(str ));$skip(41); val res$1 = 
	
	str.split("</book>").map(_+"</book>");System.out.println("""res1: Array[String] = """ + $show(res$1))}
                                        
              
}
