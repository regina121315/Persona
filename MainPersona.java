
import java.util.Scanner;
class MainPersona {
    public static void main (String [] args){
        String nombre,apellido;
        int edad;
        double altura;
        Scanner op = new Scanner (System.in);
        Persona paco = new Persona ();
        System.out.println ("¿Cual es tu nombre?");
        nombre=op.nextLine();
        paco.setNombre(nombre);
        System.out.println ("¿Cual es tu apellido?");
        apellido=op.nextLine();
        paco.setApellido(apellido);
        System.out.println ("¿Cual es tu edad?");
        edad=op.nextInt();
        paco.setEdad(edad);
        System.out.println ("¿Cual es tu altura?");
        altura=op.nextDouble();
        paco.setAltura(altura);
        
        System.out.println(paco);


        
    }

   
    }