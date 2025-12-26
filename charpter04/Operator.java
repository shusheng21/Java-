package charpter04;

public class Operator {
    public static void main(String[] args) {
        //复合运算符回进行类型转化
        byte a = 2;
        a += 3;  //等价 a = (byte)(a + 3);
        System.out.println(a); //5
        a++;  ////等价 a = (byte)(a + 1);
        System.out.println(a); //6


    }
}
