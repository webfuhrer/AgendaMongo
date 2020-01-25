import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.bson.Document;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoIterable;

public class ClasePrincipal {
public static void main(String[] args) {
	
	int opcion=EntradaSalida.pedirOpcion();
	
	
	while(opcion!=EntradaSalida.SALIR)
	{
		switch(opcion)
		{
		case EntradaSalida.INSERTAR:
			//insertar
			Contacto con=EntradaSalida.pedirContacto();
			AccesoMongo.insertarContacto(con);
			break;
		case EntradaSalida.LISTAR:
			ArrayList contactos=AccesoMongo.recuperarContactos();
			EntradaSalida.mostrarContactos(contactos);
			break;
		}
		opcion=EntradaSalida.pedirOpcion();
	}

	
}
}
