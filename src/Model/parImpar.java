package Model;

import java.util.Scanner;

public class parImpar {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Integer number: ");
        int num=s.nextInt();
        String impar="Even";
        String par="Odd";

        if(num%2==0){
            System.out.println(par);

        }else{
            System.out.println(impar);
        }
    }
}
