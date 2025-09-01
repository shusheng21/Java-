package charpter05;
import java.util.Scanner;

/**
 * public class ifexercise01 {
    public static void main(String[] args){
        int mon;
        String leix;
        for(int i = 0; i < 3;i++){
            Scanner mysc = new Scanner(System.in);
            System.out.println("请输入月份");
            mon = Integer.parseInt(mysc.nextLine());
            System.out.println("请输入类型：成人/儿童/老人");
            Scanner sc = new Scanner(System.in);
            leix = sc.nextLine();
            if(mon>=4 && mon <=10){
                System.out.println( "该季节为旺季"+leix);
                if("成人".equals(leix)){
                    System.out.println("成人价格为60");
                }
                else if("儿童".equals(leix)){
                    System.out.println("价格为30");
                }
                else if("老人".equals(leix)){
                    System.out.println("价格为20");
                }
            }
            else if((mon >=1 && mon <= 3)||(mon >= 11 && mon <= 12)){
                System.out.println("该季节为淡季");
                                if(leix == "成人"){
                    System.out.println("成人价格为40");
                }
                else if("儿童".equals(leix)){
                    System.out.println("价格为20");
                }
                else if("老人".equals(leix)){
                    System.out.println("价格为20");
                }
            }
            else{
                System.out.println("月份输入有误");
            }
        }
    }

}*/


public class ifexercise01 {
    public static void main(String[] args) {
        String aa = "儿童";
        System.out.println(aa);
        // Scanner scanner = new Scanner(System.in);
        // String a = scanner.nextLine();
        // System.out.println(a);

    //     for(int i = 0; i < 3; i++) {
    //         System.out.print("请输入月份: ");
    //         int month = Integer.parseInt(scanner.nextLine());
            
    //         System.out.print("请输入类型（成人/儿童/老人）: ");
    //         String type = scanner.nextLine();
            
    //         if(month >= 4 && month <= 10) {
    //             System.out.println("该季节为旺季");
    //             printPrice(type);
    //         } else if(month >= 1 && month <= 3 || month >= 11 && month <= 12) {
    //             System.out.println("该季节为淡季");
    //             printPrice(type);
    //         } else {
    //             System.out.println("⚠️ 月份输入有误");
    //         }
    //     }
    //     scanner.close();
    // }

    // private static void printPrice(String type) {
    //     if("成人".equals(type)) {
    //         System.out.println("价格: 60元");
    //     } else if("儿童".equals(type)) {
    //         System.out.println("价格: 30元");
    //     } else if("老人".equals(type)) {
    //         System.out.println("价格: 20元");
    //     } else {
    //         System.out.println("无效类型");
    //     }
    }
}