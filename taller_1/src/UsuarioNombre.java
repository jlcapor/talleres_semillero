import java.util.Scanner;

public class UsuarioNombre {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String usuario = "", nombre = "";
        System.out.println("Ingrese su nombre usuario: ");
        usuario += (sc.nextLine());
        System.out.println("Ingrese su nombre: ");
        nombre += (sc.nextLine());

        System.out.println("-----------Minusculas---------------");
        System.out.println(usuario.toLowerCase()); 
        System.out.println(nombre.toLowerCase()); 

        System.out.println("-----------Mayusculas---------------");
        System.out.println(usuario.toUpperCase()); 
        System.out.println(nombre.toUpperCase()); 

    }
}
