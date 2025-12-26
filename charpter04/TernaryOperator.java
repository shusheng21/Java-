package charpter04;

public class TernaryOperator {
    public static void main(String[] args) {
        //三元运算符
        //条件表达式 ？表达式1 : 表达式2
        int a = 10;
        int b = 99;
        int result = a < b ? a++ : b--;
        System.out.println("result= " + result);//a<b为真，只执行表达式1，a赋值给result->a++   10
        System.out.println("a= " + a);//11
        System.out.println("b= " + b);//a<b为真，只执行表达式1,不执行表达式2，  b = 99

    }
    
}
