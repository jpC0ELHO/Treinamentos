package Model;

import java.util.Scanner;

public class SwitchExpressao {
    public static void main(String[] args) {

        Scanner leia=new Scanner(System.in);

        System.out.println("Digite um nummero de um mes para retornar a quantidade de dias: ");
        int mes= leia.nextInt();
        int ndias;


        switch (mes){
            case 1 : case 3: case 5: case 7: case 8: case 10: case 12:
                ndias=31;
                break;
            case 4: case 6: case 9: case 11:
                ndias=30;
                break;
            default:
                ndias=28;

        }
        System.out.println(ndias);


        

//A baixo somente suportado pelo java 14+

//        switch (mes){
//            case 1, 3, 5, 7 ,8,10,12:
//                ndias=31;
//                break;
//            case 4, 6,9,11:
//                ndias=30;
//                break;
//            default:
//                ndias=28;
//
//        }

//        ndias=switch(mes){
//            case 1, 3, 5, 7 ,8,10,12->31;
//            case 4, 6,9,11 ->30;
//            default: -> 28;
//        };


    }
}
