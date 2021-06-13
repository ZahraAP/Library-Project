package myPackageLibrary;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
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


public class register {
    private String fullname;
    private String username;
    private String password;
    private String phone;
    private String email;
    
public register(){
    }    
    
public register(String fullname, String username, String password, String phone, String email) {
        this.fullname = fullname;
        this.username = username;
        this.password = password;
        this.phone = phone;
        this.email = email;
    }
    public String getFullname() {
        return fullname;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    public void save(){
        try{
            DocumentBuilderFactory  dbf=DocumentBuilderFactory.newInstance();
            DocumentBuilder db=dbf.newDocumentBuilder();
            File file=new File("F:\\Mahboubeh khanom gole golab\\backend\\Library\\src\\xml\\register.xml");
            Document d=db.parse(file);
            d.normalize();
            
            Element root = d.getDocumentElement();
            
            Element nodeElement = d.createElement("User");
            root.appendChild(nodeElement);
            
            Element p1 = d.createElement("FullName");
            Element p2 = d.createElement("Username");
            Element p3 = d.createElement("Password");
            Element p4 = d.createElement("Phone");
            Element p5 = d.createElement("Email");
            
            p1.appendChild(d.createTextNode(this.fullname));
            p2.appendChild(d.createTextNode(this.username));
            p3.appendChild(d.createTextNode(this.password));
            p4.appendChild(d.createTextNode(this.phone));
            p5.appendChild(d.createTextNode(this.email));
            
            nodeElement.appendChild(p1);
            nodeElement.appendChild(p2);
            nodeElement.appendChild(p3);
            nodeElement.appendChild(p4);
            nodeElement.appendChild(p5);
            
            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer t = tf.newTransformer();
            DOMSource source = new DOMSource(d);
            StreamResult result = new StreamResult(file);
            t.transform(source, result);
            
        }
        catch(Exception ex){
        } 
    }
    
    public static List<register> getusername() {
        List<register> objects = new ArrayList<>();
        try{
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse("F:\\Mahboubeh khanom gole golab\\backend\\Library\\src\\xml\\register.xml");
            doc.normalize();
            
            NodeList list = doc.getElementsByTagName("User");
            
            for(int i=0; i<list.getLength(); i++){
                Node n = list.item(i);
                Element e = (Element) n;
                
                register r = new register();
                
                String username = e.getElementsByTagName("Username").item(0).getTextContent();
                String password = e.getElementsByTagName("Password").item(0).getTextContent();
                
                 r.setUsername(username);
                 r.setPassword(password);
                
                
                
                objects.add(r);
                
                
            }
            return objects;
            
        }
        catch(Exception ex){
           
            return objects;
        }
    }
    
    public static List<register> getuser() {
        List<register> objects = new ArrayList<>();
        try{
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse("F:\\Mahboubeh khanom gole golab\\backend\\Library\\src\\xml\\register.xml");
            doc.normalize();
            
            NodeList list = doc.getElementsByTagName("User");
            
            for(int i=0; i<list.getLength(); i++){
                Node n = list.item(i);
                Element e = (Element) n;
                
                register r = new register();
                String fullname = e.getElementsByTagName("FullName").item(0).getTextContent();
                String username = e.getElementsByTagName("Username").item(0).getTextContent();
                String password = e.getElementsByTagName("Password").item(0).getTextContent();
                String phone = e.getElementsByTagName("Phone").item(0).getTextContent();
                String email = e.getElementsByTagName("Email").item(0).getTextContent();
                
                 r.setUsername(username);
                 r.setPassword(password);
                 r.setFullname(fullname);
                 r.setPhone(phone);
                 r.setEmail(email);
                 
                objects.add(r);
                
                
            }
            return objects;
            
        }
        catch(Exception ex){
           
            return objects;
        }
    }
    
}


