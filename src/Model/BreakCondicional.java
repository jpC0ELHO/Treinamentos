package Model;

public class BreakCondicional {
    public static void main(String[] args) {

//        é interrompido quando i é igual a 4. Na quarta iteração, a condição valor/i == 2 é avaliada como 10/4, que é falso. Portanto, o loop é interrompido após essa iteração.
//
//        Como a condição nunca se torna verdadeira, o loop continuará executando até que i seja igual a 99, mas a condição não será atendida, e o loop terminará naturalmente quando i se tornar 100.
//
//        Dessa forma, o loop é interrompido quando valor é igual a 10 e i é igual a 4.
        int valor=10;
        for(int i=1; i<100;i++){
            System.out.println("valor= "+valor+" i= "+i);
            if(valor/i==2){
                break;
            }
        }
    }
}
