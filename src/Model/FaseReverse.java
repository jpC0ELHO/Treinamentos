package Model;

import java.util.Scanner;

public class FaseReverse {
    public static void main(String[] args) {
        //Escreve a frase ou palavra de trás pra frente
        Scanner s=new Scanner(System.in);
        System.out.println("Escreva sua frase ou palavra para inverter: ");
        String str=s.nextLine();

        StringBuilder reverse=new StringBuilder();
        for(int i=str.length()-1;i>=0;i--){
            reverse.append(str.charAt(i));

        }
        System.out.println(reverse.toString());
    }
}
