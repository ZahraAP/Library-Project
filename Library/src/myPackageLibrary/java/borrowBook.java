
package myPackageLibrary;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
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

public class borrowBook {
    private String bookName;
    private String auther;
    private String genre;
    private String username;
   
  public borrowBook(){
      
  }
    public borrowBook(String bookName, String auther, String genre,String username) {
        this.bookName = bookName;
        this.auther = auther;
        this.genre = genre;
        this.username=username;
       
    }

    public String getUsername() {
        return username;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuther() {
        return auther;
    }

    public void setAuther(String auther) {
        this.auther = auther;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setUsername(String username) {
        this.username = username;
    }

   
    public void saveBorrowBook(){
        try{
            DocumentBuilderFactory  dbf=DocumentBuilderFactory.newInstance();
            DocumentBuilder db=dbf.newDocumentBuilder();
            File file=new File("F:\\Mahboubeh khanom gole golab\\backend\\Library\\src\\xml\\borrowBook.xml");
            Document d=db.parse(file);
            d.normalize();
            
            Element root = d.getDocumentElement();
            
            Element nodeElement = d.createElement("Book");
            root.appendChild(nodeElement);
            
            Element p1 = d.createElement("BookName");
            Element p2 = d.createElement("Auther");
            Element p3 = d.createElement("Genre");
            Element p4 = d.createElement("UserName");
            
            
            p1.appendChild(d.createTextNode(this.bookName));
            p2.appendChild(d.createTextNode(this.auther));
            p3.appendChild(d.createTextNode(this.genre));
            p4.appendChild(d.createTextNode(this.username));
            
            
            nodeElement.appendChild(p1);
            nodeElement.appendChild(p2);
            nodeElement.appendChild(p3);
             nodeElement.appendChild(p4);
            
           
            
            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer t = tf.newTransformer();
            DOMSource source = new DOMSource(d);
            StreamResult result = new StreamResult(file);
            t.transform(source, result);
            
           
            
        }
        catch(Exception ex){
        } 
       
    }
    
    
    public static List<borrowBook> getBorrowbooks() {
        List<borrowBook> objects = new ArrayList<>();
        try{
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse("F:\\Mahboubeh khanom gole golab\\backend\\Library\\src\\xml\\borrowBook.xml");
            doc.normalize();
            
            NodeList list = doc.getElementsByTagName("Book");
            
            for(int i=0; i<list.getLength(); i++){
                Node n = list.item(i);
                Element e = (Element) n;
                
                borrowBook b = new borrowBook();
                String bookname = e.getElementsByTagName("BookName").item(0).getTextContent();
                String auther = e.getElementsByTagName("Auther").item(0).getTextContent();
                String genre = e.getElementsByTagName("Genre").item(0).getTextContent();
                String username = e.getElementsByTagName("UserName").item(0).getTextContent();  
                 b.setBookName(bookname);
                 b.setAuther(auther);
                 b.setGenre(genre);
                 b.setUsername(username);
                  objects.add(b);
                
                
            }
            return objects;
            
        }
        catch(Exception ex){
           
            return objects;
        }
    }
}
   
    

