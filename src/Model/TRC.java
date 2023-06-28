package Model;

import java.io.IOException;
import java.util.Scanner;



public class TRC {

    public static void main(String[] args) {
        Scanner leia=new Scanner(System.in);
        System.out.println("Escreva um numero: ");
        Double num1= leia.nextDouble();

        System.out.println("Escreva outro numero: ");
        Double num2= leia.nextDouble();
        leia.nextLine();
        Double result = null;
        System.out.println("Escolha o operador numerico: ");
        System.out.println("+");
        System.out.println("-");
        System.out.println("*");
        System.out.println("/");
        String opr= leia.nextLine();
            switch (opr){
                case "+":
                    result=num1+num2;
                    System.out.println(num1+"+"+num2+"="+result);
                    break;
                case"-":
                    result=num1-num2;
                    System.out.println(num1+"-"+num2+"="+result);
                    break;
                case"*":
                    result=num1*num2;
                    System.out.println(num1+"*"+num2+"="+result);
                    break;
                case "/":
                    result=num1/num2;
                    System.out.println(num1+"/"+num2+"="+result);
                    break;

            }




    }

}
