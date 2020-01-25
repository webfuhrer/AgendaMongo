import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author CDMFP
 */
class EntradaSalida {
final static int INSERTAR=1;
final static int LISTAR=2;
final static int BUSCAR=3;
final static int SALIR=4;
    static int pedirOpcion() {
        
        System.out.println(INSERTAR+"-Insertar contacto");
        System.out.println(LISTAR+"-Listar contactos");
        System.out.println(BUSCAR+"-Buscar contacto por nombre");
        System.out.println(SALIR+"-Salir");
        Scanner sc=new Scanner(System.in);
        int opcion=sc.nextInt();
        return opcion;
    }

    static Contacto pedirContacto() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nombre: ");
        String nombre=sc.nextLine();
        System.out.println("Teléfono:");
        String telefono=sc.nextLine();
       Contacto c=new Contacto(nombre, telefono);
        return c;
    }

    static void mostrarContactos(ArrayList<Contacto> lista_contactos) {
        for (Contacto contacto : lista_contactos) {
            System.out.println(contacto);
        }
    }

    static String pedirNombre() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nombre buscado: ");
        String nombre=sc.nextLine();
        return nombre;
    }
    
}
