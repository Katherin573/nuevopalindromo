

package palindromo;
import java.util.*;

public class Palindromo {


    public static void main(String[] args) {

        Scanner teclado= new Scanner(System.in);
        String nuevo;
        Pila objclass=new Pila();
        System.out.println("Ingresa la palabra");
        nuevo = teclado.nextLine();
        if(objclass.espalindromo(nuevo)){
            System.out.println("Palindromo");
        }
        else
        {
            System.out.println("No Palindromo");
        }
    }
    
}
