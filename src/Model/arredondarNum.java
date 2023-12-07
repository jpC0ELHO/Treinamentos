package Model;

public class arredondarNum {
    //num1 seria o numero recebido
    //num2 seria o numero selecionado para ser o multiplicador
    public static int arredondador(int num1,int num2){
        int num3=num2-1;
        if(num1>=0){
            return((num1+num3)/num2)*num2;
        }else {
            return(num1/num2)*num2;
        }
    }
}
