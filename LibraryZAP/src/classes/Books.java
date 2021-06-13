
package classes;

import forms.BookList;
import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Books {
    public String bookName;
    public String author;
    public String genre;
    public Boolean available;

    public Books(String bookName, String author, String genre, Boolean available) {
        this.bookName = bookName;
        this.author = author;
        this.genre = genre;
        this.available = available;
    }
    
    

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }
    
    public void addBook() {
        try{
            
            DocumentBuilderFactory dbf =DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            File f = new File("C:\\Users\\Zahra AP\\Desktop\\Library\\src\\xml\\Books.xml");
            Document doc = db.parse(f);
            doc.normalize();
            
            Element root = doc.getDocumentElement();
            
            Element nodeElement = doc.createElement("Book");
            root.appendChild(nodeElement);
            
            Element p1 = doc.createElement("bookName");
            p1.appendChild(doc.createTextNode(this.bookName));
            nodeElement.appendChild(p1);
            
            Element p2 = doc.createElement("Author");
            p2.appendChild(doc.createTextNode(this.author));
            nodeElement.appendChild(p2);
            
            Element p3 = doc.createElement("Genre");
            p3.appendChild(doc.createTextNode(this.genre));
            nodeElement.appendChild(p3);
            
            
            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer t = tf.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(f);
            t.transform(source, result);
            
        }
        catch (Exception ex) {
        }
    }
    
//    public void readBooks() {
//
//        try{
//                DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
//                DocumentBuilder db = dbf.newDocumentBuilder();
//                Document doc = db.parse("C:\\Users\\Zahra AP\\Desktop\\Library\\src\\xml\\Books.xml");
//                doc.normalize();
//
//                NodeList tags = doc.getElementsByTagName("Book");
//
//                for(int i=0; i<tags.getLength(); i++){
//                    Node n = tags.item(i);
//                    Element e = (Element) n;
//                     
//
//                    }
//
////                    System.out.println(e.getElementsByTagName("Password").item(0).getTextContent());
//
//                  String un = e.getElementsByTagName("Username").item(0).getTextContent();
//                  String pw = e.getElementsByTagName("Password").item(0).getTextContent();
//                  Customer h = new Customer(un, pw);
//                              
//                }
//            }
//            catch(Exception ex){
//                System.out.println("err");
//            }
//        

//        DocumentBuilderFactory dbf =DocumentBuilderFactory.newInstance();
//        DocumentBuilder db = dbf.newDocumentBuilder();
//        File f = new File("C:\\Users\\Zahra AP\\Desktop\\Library\\src\\xml\\Books.xml");
//        Document doc = db.parse(f);
//        doc.normalize();
//        
//        NodeList tags = doc.getElementsByTagName("Book");
//
//                for(int i=0; i<tags.getLength(); i++){
//                    Node n = tags.item(i);
//                    Element e = (Element) n;
//
//                    Customer j = new Customer(this.username, this.password);
//
////                    String un = e.getElementsByTagName("username").item(0).getTextContent();
//                    String pw = e.getElementsByTagName("password").item(0).getTextContent();
//
//    }
}
