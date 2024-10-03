import java.util.HashMap; //Importar 
import java.util.Scanner; //Importar la clase

public class codigo7 {
	//Este código te pregunta por un nombre de un pais y si tiene en sus datos te regresará la capital de ese pais
	// Si no tiene el dato te lo pregunta y lo guarda en sus datos, te va a estar preguntando hasta que tu decidas "salir"
	
	public static void main(String[] args) {

    Scanner s = new Scanner(System.in); //Agregar System.in 

    HashMap<String, String> capitales = new HashMap<>();  //Cambiar los argumentos de HasMap  y agregar el nombre de manera correcta

    capitales.put("Canadá", "Otawwa");
    capitales.put("Estados Unidos", "Washington DC");
    capitales.put("México", "México DF");
    capitales.put("Belice", "Belmopán");
    capitales.put("Costa rica", "San José");
    capitales.put("El Salvador", "San Salvador");  //Se agrega la capital de El Salvador 
    capitales.put("Guatemala", "Ciudad de Guatemala");
    capitales.put("Honduras", "Tegucigalpa");
    capitales.put("Nicaragua", "Managua");
    capitales.put("Panamá", "Panamá");
   
    String c = ""; //corregir la palabra string
    do {
      System.out.print("Escribe el nombre de un país y te diré su capital: "); //cambiar in por out
      c = s.nextLine(); //Se cambia a Line
      
      if (!c.equals("salir")) { //agregar s
        if (capitales.containsKey(c)) { //cambiar value por key
          System.out.print("La capital de " + c); //agregar out 
          System.out.println(" es " + capitales.get(c));// cambio put por get 
        } else {
          System.out.print("No conozco la respuesta ");
          System.out.print("¿cuál es la capital de " + c + "?: ");
          String ca = s.nextLine();
          capitales.put(c, ca);
          System.out.println("Gracias por enseñarme nuevas capitales");
        }//else
      }
    } while (!c.equals("salir")); //Se corrige la palabara while y agregar parentesis 
    
    
  }// main 
}// class codigo7