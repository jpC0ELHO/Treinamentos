package Model;

import java.util.Arrays;
import java.util.List;

public class ArraySoma {
    public static void main(String[] args) {

        List<Integer> lista= Arrays.asList(1,2,3,4,5);

        double soma=lista.stream().mapToInt(Integer::valueOf).sum();
        System.out.println(soma);

    }
}
