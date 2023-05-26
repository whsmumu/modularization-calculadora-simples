import java.util.Scanner;
public class ModuloCalc {
    public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);
        int opc, num1, num2;
        do{
        System.out.println("----CALCULADORA SIMPLES----");
        System.out.println("Escolha uma das opções: ");
        System.out.println("1- Soma");
        System.out.println("2- Subtração");
        System.out.println("3- Divisão");
        System.out.println("4- Multiplicação");
        System.out.println("5- Sair");
        System.out.println("---------------------------");
        opc = scan.nextInt();
        if(opc!=5){
        System.out.println("Digite um numero: ");
        num1 = scan.nextInt();
        System.out.println("Digite outro numero: ");
        num2 = scan.nextInt();
        switch(opc){
             case 1: soma(num1, num2);
             break;
             case 2: sub(num1, num2);
             break;
             case 3: div (num1, num2);
             break;
             case 4: mult(num1,num2);
             break;
               }
          }
     }while(opc!=5);
}
    public static int soma(int a, int b){
        final int c;
        c = a + b;
        System.out.println("A soma é: "+c);
        return c;
   }
   public static int sub(int a, int b){
        int c;
        c = a - b;
        System.out.println("A subtração é: "+c);
        return c;
   }
   public static double div(double a, double b){
     double c;
     c = a / b;
     System.out.println("A divisão é "+c);
     return c;
   }
   public static int mult(int a, int b){
     int c;
     c = a * b;
     System.out.println("A multiplicação é "+c);
     return c;
   }
}