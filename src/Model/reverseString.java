package Model;

public class reverseString {
    public static String rvs(String str){
        String reverse="";
        for(int i=str.length()-1;i>=0;i--){
            reverse+=str.charAt(i);
        }
        return reverse;
    }
    //Reverter Frases
    public static String rvsFras(final String frase){
        String[] str=frase.split(" ");
        if(str.length==0){
            return frase;
        }
        String reverse="";
        for(String revers:str){
            StringBuilder insert=new StringBuilder();
            reverse+=insert.append(revers).reverse().toString()+" ";

        }
        return reverse.trim();
    }
}
