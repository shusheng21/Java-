public class AutoConvert{
    public static void main(String[]args){
        //自动类型转化是低精度向高精度转化
        //1、char->int->long->float->double
        //2、byte->short->int->long-float->double
        int a = 'A';//字符'A'的ASCII码值65,char->int
        System.out.println(a);
        double b = 3; //int->double
        System.out.println(b);

        //细节1
        //如果一个表达式中有多种类型，Java会自动将低精度的类型转换为最高精度的类型，计算的结果也是最高精度的类型
        double n1 = 2.7 + 10; //int->double
        System.out.println(n1); //输出12.7
        //float n2 = 2.7 + 10;//错误 因为2.7是double类型，10是int类型，结果是double类型，不能赋值给float
        float n2 = 2.7f + 10; //float+int=float,结果是double类型
        System.out.println(n2); //输出12.7

        //细节2：（byte、short）和char之间不会发生类型转化
        //对于byte,它的范围是-128~127，如果一个具体的数赋值给byte类型的变量，若该具体的数在byte范围内，则可以
        byte b1 = 20; //可以
        System.out.println(b1);
        //byte b2 = 200; //错误，200超出了byte的范围
        int i1 = 20; 
        //byte b3 = i1; //错误，int类型不能直接赋值给byte类型，虽然20在byte范围内

        //细节3byte、short、char他们三者可以计算，在计算时先将类型转化为int，计算结果也为int
        byte b3 = 10;
        short s1 = 20;
        //ort s2 = b3 + s1; //b3和s1先转化为int类型，计算结果为int类型，int->short错误
        int i2 = b3 + s1; //可以，int类型可以接收int类型的结果
        System.out.println(i2); //输出30
        short s2 = 3;
        // short s3 = s1 + s2; //s1和s2都是short类型，计算结果为int类型，不能int->short
    }
}