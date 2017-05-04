import xml._

object test {
val data:Elem  = <book id="bk101">
		<author>Gambardella, Matthew</author>
		<title>XML Developer's Guide</title>
		<genre>Computer</genre>
		<price>44.95</price>
		<publish_date>2000-10-01</publish_date>
		<description>An in-depth look at creating applications
			with XML.
		</description>
	</book>                                   //> data  : scala.xml.Elem = <book id="bk101">
                                                  //| 		<author>Gambardella, Matthew</author>
                                                  //| 		<title>XML Developer's Guide</title>
                                                  //| 		<genre>Computer</genre>
                                                  //| 		<price>44.95</price>
                                                  //| 		<publish_date>2000-10-01</publish_date>
                                                  //| 		<description>An in-depth look at creating applications
                                                  //| 			with XML.
                                                  //| 		</description>
                                                  //| 	</book>
	
	val elements = Array("book","author","title","price","publish_date","description")
                                                  //> elements  : Array[String] = Array(book, author, title, price, publish_date, 
                                                  //| description)
	
	val nodeSeq: NodeSeq = data               //> nodeSeq  : scala.xml.NodeSeq = <book id="bk101">
                                                  //| 		<author>Gambardella, Matthew</author>
                                                  //| 		<title>XML Developer's Guide</title>
                                                  //| 		<genre>Computer</genre>
                                                  //| 		<price>44.95</price>
                                                  //| 		<publish_date>2000-10-01</publish_date>
                                                  //| 		<description>An in-depth look at creating applications
                                                  //| 			with XML.
                                                  //| 		</description>
                                                  //| 	</book>
	
	data.label                                //> res0: String = book
	val book = data \"book"                   //> book  : scala.xml.NodeSeq = NodeSeq()
  book.iterator.foreach { println }
 
 
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
	</book>"""                                //> str  : String = <book id="bk101">
                                                  //| 		<author>Gambardella, Matthew</author>
                                                  //| 		<title>XML Developer's Guide</title>
                                                  //| 		<genre>Computer</genre>
                                                  //| 		<price>44.95</price>
                                                  //| 		<publish_date>2000-10-01</publish_date>
                                                  //| 		<description>An in-depth look at creating applications
                                                  //| 			with XML.
                                                  //| 		</description>
                                                  //| 	</book>
                                                  //| 	<book id="bk101">
                                                  //| 		<author>Gambardella, Matthew</author>
                                                  //| 		<title>XML Developer's Guide</title>
                                                  //| 		<genre>Computer</genre>
                                                  //| 		<price>44.95</price>
                                                  //| 		<publish_date>2000-10-01</publish_date>
                                                  //| 		<description>An in-depth look at creating applications
                                                  //| 			with XML.
                                                  //| 		</description>
                                                  //| 	</book>
	
	str.split("</book>").map(_+"</book>")     //> res1: Array[String] = Array(<book id="bk101">
                                                  //| 		<author>Gambardella, Matthew</author>
                                                  //| 		<title>XML Developer's Guide</title>
                                                  //| 		<genre>Computer</genre>
                                                  //| 		<price>44.95</price>
                                                  //| 		<publish_date>2000-10-01</publish_date>
                                                  //| 		<description>An in-depth look at creating applications
                                                  //| 			with XML.
                                                  //| 		</description>
                                                  //| 	</book>, "
                                                  //| 	<book id="bk101">
                                                  //| 		<author>Gambardella, Matthew</author>
                                                  //| 		<title>XML Developer's Guide</title>
                                                  //| 		<genre>Computer</genre>
                                                  //| 		<price>44.95</price>
                                                  //| 		<publish_date>2000-10-01</publish_date>
                                                  //| 		<description>An in-depth look at creating applications
                                                  //| 			with XML.
                                                  //| 		</description>
                                                  //| 	</book>")
                                        
              
}