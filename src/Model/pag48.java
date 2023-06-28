package Model;

public class pag48 {
    public static void main(String[] args) {
        //=============PAG49============
            //Abaixo incremento de duas formas
//        int x=0,y=2;
//        y=++x;
//        System.out.println("x="+x+", y="+y);
//
//        y=x++;
//        System.out.println("x="+x+", y="+y);

        //===========PAG50=========

        short s=3;
        int i =s*5;//s e promovido para int
        long l=23+i;//literal 23 e i são promovidos para long
        float f=1.5f;
        double d= 2.5+f;//f e promovido para double

        var res=l/d;//d e promovido para double, tipo resultado 4.0

        //Type casting:
        double di=3.47;
        int x=(int)di;// x recebe 3, parte fracionaria é truncada
        float fi=(float)(2*di);// resultado convertido para float (menor precisão)

    }


}
