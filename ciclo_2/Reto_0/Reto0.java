
import java.util.Scanner;

class Reto0 {

     private final Scanner scanner = new Scanner(System.in);


    public String read(){
        return this.scanner.nextLine();
    }

    
    public void run(){

   
        switch (operacion) {
            case "Sumar":
                System.out.println("La suma es " + sumar(a, b));
                break;
            case "Restar":
                System.out.println("La resta es " + restar(a, b));
                break;
            case "Multiplicar":
                System.out.println("La multiplicacion es " + multiplicar(a, b));
                break;
            default:
                System.out.println("Operación desconocida");
                break;
        }

    }

    public static int sumar(int a, int b) {
        int resultado = a + b;
        return resultado;
    }

    public static int restar(int x, int y) {
        int resultado = x - y;
        return resultado;
    }

    public static int multiplicar(int a, int b) {
        int resultado = a * b;
        return resultado;
    }

    public static double dividir(int a, int b) {
        double resultado = a / b;
        return resultado;
    }

    public static void run() {
        System.out.println("hola");
    }
}
