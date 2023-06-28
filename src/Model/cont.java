package Model;

import java.util.Scanner;

public class cont {
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);

        System.out.println("Escerva um numero: ");
        int str=s.nextInt();
        System.out.println("Segundo numero para contagem: ");
        int str2=s.nextInt();

        if(str<str2){

            for(int i=str; i<=str2;i++){
                System.out.println(i);

            }
        }else if(str>str2){
            for(int i=str; i>=str2;i--){
                System.out.println(i);

            }
        }

    }
}
