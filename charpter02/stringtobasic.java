public class stringtobasic{
    public static void main(String[] args) {
        
        int n1 = 10;
        float f1 = 21.3f;
        double d1 = 3.14;
        boolean b1 = true;
//1：基本数据类型转化成String字符串类型，只需要在后面+""
        String s1 = n1 + "";
        String s2 = f1 + "";
        String s3 = d1 + "";
        String s4 = b1 + "";
        System.out.println(s1 + " " + s2 + " " + s3 + " " + s4);

        
//2：String字符串类型转化成基本数据类型：通过基本数据类型的包装类调用parseXX方法
        String s = "123";
        int num1 = Integer.parseInt(s);
        double num2 = Double.parseDouble(s);
        float num3 = Float.parseFloat(s);   
        byte num4 = Byte.parseByte(s);
        short num5 = Short.parseShort(s);
        long num6 = Long.parseLong(s);
        boolean bb = Boolean.parseBoolean("true");

        System.out.println("=====================================");
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);
        System.out.println(num6);
        System.out.println(bb);

//String字符串不能直接转成char字符，**把字符串String转成字符char**  含义是把字符串的第一个字符转成char
        String ss = "abcd";
        char cc = ss.charAt(0);//'a'
        char cc1 = ss.charAt(1);//'b'
        System.out.println(cc);
        System.out.println(cc1);

    }
}