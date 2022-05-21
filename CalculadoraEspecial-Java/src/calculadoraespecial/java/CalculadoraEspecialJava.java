package calculadoraespecial.java;
import java.util.Scanner;
public class CalculadoraEspecialJava {
   
    public static void main(String[] args) {
        System.out.println("Calculadora");
        System.out.println("Digite el numero de la funcion que desea realizar");
        int accion = 1;
        FuncionesEspeciales CalculadoraEspecial = new FuncionesEspeciales();
        while (accion != 0) {
            Scanner escaner = new Scanner (System.in);
            System.out.println("Funciones Basicas");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("Funciones Especiales");
            System.out.println("5. Valor Absoluto");
            System.out.println("6. Raiz");
            System.out.println("7. Tangente");
            System.out.println("8. Seno");
            System.out.println("9. Historial");
            System.out.println("0. Salir");
            accion = escaner.nextInt();
            
            
            double[] res; double res1;
            switch (accion) {
                case 1:
                    res = leerNumeros();
                    System.out.println(CalculadoraEspecial.suma(res[0], res[1]));
                    break;

               case 2:
                    res = leerNumeros();
                    System.out.println(CalculadoraEspecial.resta(res[0], res[1]));
                    break;

                case 3:
                    res = leerNumeros();
                    System.out.println(CalculadoraEspecial.multiplicacion(res[0], res[1]));
                    break;

                case 4:
                    res = leerNumeros();
                    System.out.println(CalculadoraEspecial.division(res[0], res[1]));
                    break;

                case 5:
                    res1 = leerNumeros("valor absoluto");
                    System.out.println(CalculadoraEspecial.valorAbsoluto(res1));
                    break;

                case 6:
                    res1 = leerNumeros("raiz");
                    System.out.println(CalculadoraEspecial.raiz(res1));
                    break;

                case 7:
                    res1 = leerNumeros("tangente");
                    System.out.println(CalculadoraEspecial.tangente(res1));
                    break;

                case 8:
                    res1 = leerNumeros("seno");
                    System.out.println(CalculadoraEspecial.seno(res1));
                    break;

                case 9:
                    CalculadoraEspecial.mostrarHistorial();
                    break;
            }
        }
    }
    
    public static double[] leerNumeros(){
        Scanner escaner = new Scanner (System.in);
        double[] num = new double[2]; 
        System.out.println("Ingrese el primer valor");
        num[0] = escaner.nextDouble();
        System.out.println("Ingrese el segundo valor");
        num[1] = escaner.nextDouble();
        return num;
    }
    
    private static double leerNumeros(String option){
        Scanner escaner = new Scanner (System.in);
        double num; 
        System.out.println("Ingrese el nuemero del cual desea conocer su " + option);
        num = escaner.nextDouble();
        return num;        
    }

}
    
        
        
        
    

    
    

