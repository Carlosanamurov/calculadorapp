import java.util.Scanner;

public class calculadora{
    public static void main(String[] args)
    {
        System.out.println("Enter first and second number:");
        Scanner teclado= new Scanner(System.in);
        int num1,num2;
        num1 =teclado.nextInt();
        num2 = teclado.nextInt();
     
        
        System.out.println("precione los siguientes numeros: sumar = 1 , RESTAR = 2, MULT = 3, DIV = 4");
        int choose;
        choose = teclado.nextInt();
        switch (choose){
        case 1:
            System.out.println(suma( num1,num2));
            break;
        case 2:
            System.out.println(resta( num1,num2));
            break;     
        case 3:
            System.out.println(multiplicacion( num1,num2));
            break;
        case 4:
            System.out.println(division( num1,num2));
            break;
            default:
                System.out.println("operacion errada");


        }



    }
    public static int suma(int x, int y)
    {
        int result = x + y;
        return result;
    }
    public static int resta(int x, int y)
    {
        int result = x-y;
        return result;
    }
    public static int multiplicacion(int x, int y)
    {
        int result = x*y;
        return result;
    }
    public static int division(int x, int y)
    {
        int result = x/y;
        return result;
    }


}
