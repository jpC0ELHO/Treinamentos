package Model;

public class ArraySoma2 {
    public static void main(String[] args) {

        double soma=0;
        double[] list={1,2,3,4,5};
        for(int i=0;i<list.length;i++){
            soma+=list[i];
        }
        System.out.println(soma);
    }
}
