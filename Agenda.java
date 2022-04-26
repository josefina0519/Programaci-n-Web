
import java.util.Scanner;
public class Agenda {
 public static void main(String[] args) {

 	System.out.println("Bienvenido a AgendaJo");
 	System.out.println("Presione la opción que desee ejecutar");
 	System.out.println("1-Ingresar un nuevo contacto");
    System.out.println("2-consultar un contacto existente");
    System.out.println("3-Salir");

	String mateo="Mateo";
 	String nombre;
 	String mail;
 	int numero;
 	Scanner tec=new Scanner(System.in);
    int opc=tec.nextInt();

    

 	switch(opc){
 		case 1:
 			System.out.println("Ingrese su nombre");
            nombre=tec.next();
 			System.out.println("Ingrese su número");
            numero=tec.next();
 			System.out.println("Ingrese su mail");
            mail=tec.next();
 			System.out.println("Contacto ingresado con éxito");
 		case 2:
 			System.out.println("Ingrese el nombre del contacto");
 			nombre=tec.next();
 			if (nombre=="Mateo") {
                System.out.println("El contacto está ingresado");
            } System.out.println("El contacto no existe, pero lo puede agregar");
				
         case 3:
			break;
			default:System.out.println("Caso no contemplado");
			break;
         } 
        }
    }
 	



