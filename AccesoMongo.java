import java.util.ArrayList;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;

public class AccesoMongo {
	
	static MongoClient m=new MongoClient(new MongoClientURI("mongodb://localhost:27017"));
	static MongoDatabase bd=m.getDatabase("local");
	static MongoCollection coleccion=bd.getCollection("agenda");
public static ArrayList<Contacto> recuperarContactos()
	{
	ArrayList<Contacto> contactos=new ArrayList();
	FindIterable agenda=coleccion.find();
	MongoCursor c=agenda.iterator();
	
	while(c.hasNext())
	{
		Document d=(Document)c.next();
		String nombre=d.getString("nombre");
		String telefono=d.getString("telefono");
		Contacto contacto=new Contacto(nombre, telefono);
		contactos.add(contacto);
	}
	
	return contactos;
	}
public static void insertarContacto(Contacto c)
{
	Document doc=new Document();
	doc.put("nombre", c.getNombre());
	doc.put("telefono", c.getTelefono());
	coleccion.insertOne(doc);
}
}

