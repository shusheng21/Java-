package demo1;

public class test01 {
     public static void main(String[] args) {
        System.out.println("书名\t作者\t价格\t销量\n三国演义\t罗贯中\t29.9\t1000");

        double n1 = 2.7;
        double n2 = 8.1 / 3; //桉树学理论计算n2 = 2.7,实际计算机计算n2 = 2.699999999...;
        if(n1 == n2 ){
            System.out.println("n1和n2相等");//该方法比较大小不行
        }
        if(Math.abs(n1-n2)<0.00001){
            System.out.println("n1和n2相等!!");
        }  
    }
}
