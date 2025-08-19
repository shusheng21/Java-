public class ForceConvert {
    public static void main(String[] args){
        int n1 = (int)1.9;//强制类型转化
        System.out.println("n1=" + n1);//精度丢失
        int n2 = 1000;
        byte b1 = (byte)n2;//数据溢出
        System.out.println("b1=" + b1);

        //细节1：强转符号是用于高精度->低精度，且只对最近的操作数有效
        //int n3 = (int)3.5 * 10 + 6 * 1.5; //错误  double->int
        int n4 = (int)(3.5 * 10 + 6 * 1.5);
        System.out.println("n4=" + n4);

        //细节2：char类型可以保存int类型的常量，但是不能保存int类型的变量，需要强转
        char c5 = 97;
        System.out.println("C5=" + c5);
        int n5 = 97;
        // char c61 = n5;
        char c6 = (char)n5;
        System.out.println("c6 = " + c6);


    }
    
}
