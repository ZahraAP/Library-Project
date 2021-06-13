package classes;

import forms.BookList;
import forms.Login;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
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


public class Customer {
    private String username;
    private String password;
    private String name;
    private String email;
    private Integer number;

    public Customer(String username, String password, String name, String email, Integer number) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.email = email;
        this.number = number;
    }

    public Customer(String username, String password) {
        this.username = username;
        this.password = password;
    }
    
    public Customer(String username){
        this.username = username;
    }
    
    public Customer() {
        
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Integer getNumber() {
        return number;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
    
    public void submit() {
        try{
            
            DocumentBuilderFactory dbf =DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            File f = new File("C:\\Users\\Zahra AP\\Desktop\\Library\\src\\xml\\Customers.xml");
            Document doc = db.parse(f);
            doc.normalize();
            
            Element root = doc.getDocumentElement();
            
            Element nodeElement = doc.createElement("Customer");
            root.appendChild(nodeElement);
            
            Element p1 = doc.createElement("Name");
            p1.appendChild(doc.createTextNode(this.name));
            nodeElement.appendChild(p1);
            
            Element p2 = doc.createElement("Password");
            p2.appendChild(doc.createTextNode(this.password));
            nodeElement.appendChild(p2);
            
            Element p3 = doc.createElement("Email");
            p3.appendChild(doc.createTextNode(this.email));
            nodeElement.appendChild(p3);
            
            Element p4 = doc.createElement("Number");
            p4.appendChild(doc.createTextNode(this.number.toString()));
            nodeElement.appendChild(p4);
            
            Element p5 = doc.createElement("Username");
            p5.appendChild(doc.createTextNode(this.username));
            nodeElement.appendChild(p5);
            
            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer t = tf.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(f);
            t.transform(source, result);
            
        }
        catch (Exception ex) {
        }
    }
    
    
    
//    public void checkUserPass() {
//        
//        try{
//                DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
//                DocumentBuilder db = dbf.newDocumentBuilder();
//                Document doc = db.parse("C:\\Users\\Zahra AP\\Desktop\\Library\\src\\xml\\Customers.xml");
//                doc.normalize();
//
//                NodeList tags = doc.getElementsByTagName("Customer");
//
//                for(int i=0; i<tags.getLength(); i++){
//                    Node n = tags.item(i);
//                    Element e = (Element) n;
//                    
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
//        
//    }
}