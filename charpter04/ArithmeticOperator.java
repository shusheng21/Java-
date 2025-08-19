package charpter04;

public class ArithmeticOperator {
    public static void main(String[] args) {
        //  /、 %
        System.out.println(18 / 5);//数学上为3.6 ，java中为3 因为两个int的数运算结果为int (直接舍弃小数，不会四舍五入)
        //只要有一个数是double的，在计算时都会自动类型转化为精度最高的那个类型。
        System.out.println(18.0/5);//3.6  
        System.out.println(18/5.0);//3.6

        double n1 = 18 / 5; 
        System.out.println(n1);// 18/5=3 -> int->double 3->3.0

        System.out.println("=====================");
        //% 取模（取余）
        //本质：a/b = a - a/b*b
        System.out.println(10 % 3); //1   10/3=3....1(余数为1)
        System.out.println(-10 % 3); //-1
        System.out.println(10 % -3); //1  10 - 10/(-3)*(-3) = 10-9 = 1
        System.out.println(-10 % -3);//-1   (-10)-(-10)/(-3)*(-3) = -10+9 = -1

        System.out.println("=====================");
//面试题 
        int i = 1;
        i = i++; //(1)temp = i; (2)i = i + 1; (3)i = temp;
        System.out.println(i); //1

        int j = 1;
        j = ++j; //(1)j = j + 1; (2)temp = j; (3)j = temp;
        System.out.println(j); //2

        int i1 = 10;
        int i2 = 20;
        int i3 = i1++; //(1)i3 = i1 ; (2)i1 = i1 + 1
        System.out.println("i3 = " + i3); //10
        System.out.println("i2 = " + i2); //20

        //此时 i1=11 

        i3 = --i2; //(1)i2 = i2 - 1; (2)i3 = i2
        System.out.println("i3 = " + i3); //19
        System.out.println("i2 = " + i2); //19

        System.out.println("=====================**********************==================");
        int N1 = 59;
        int num1 = N1/7;
        int day = N1%7;
        System.out.println("还有" + num1 + "个星期零" + day + "天");

        double Ht = 1234.6;
        double ST = 5.0/9.0*(Ht - 100.0);
        System.out.println("华氏温度 " + Ht + "对应的摄氏温度为：" + ST);

    }
}
