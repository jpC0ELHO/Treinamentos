package Model;

import java.util.Scanner;

public class ArraySplit {
    public static void main(String[] args) {
        //reverte so as palavras e não a frase inteira...
        Scanner s=new Scanner(System.in);
        System.out.println("Escreva uma palavra ou frase para reverter: ");
        String str=s.nextLine();
        String[] words= str.split(" ");
        String result="";
        for(String revers:words){

            StringBuilder inserir=new StringBuilder();
            result+=inserir.append(revers).reverse().toString()+" ";

        }
        System.out.print(result.trim());
    }
}
