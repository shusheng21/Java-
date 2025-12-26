package charpter05;
import java.util.Scanner;
public class ifoperator {
    public static void main(String[] args) {
            boolean b = true;
            if(b = false){
                System.out.println("a");
            }
            else if(b){
                System.out.println("b");
            }
            else if(!b){
                System.out.println("c");
            }
            else{
                System.out.println("d");
            }
            System.out.println("==========================");


            // double score;
            // char gender;
            // int i = 2;
            // while(i>0){
            //     System.out.println("请输入第" + (3-i) + "个人的成绩");
            //     Scanner mysc = new Scanner(System.in);
            //     score = mysc.nextDouble();
            //     System.out.println("请输入第" + (3-i) + "一个人的性别");
            //     Scanner mysc1 = new Scanner(System.in);
            //     gender = mysc1.next().charAt(0);
            //     if(score > 8){
            //         if(gender == 'F'){
            //             System.out.println("进入决赛：女子组");
            //         }else{
            //             System.out.println("进入决赛：男子组");
            //         }
            //     }
            //     else{
            //         System.out.println("被淘汰");
            //     }
            //     i--;
            // }
            int a;
            System.out.println("请输入a");
            Scanner sc = new Scanner(System.in);
            a = sc.nextInt();
            switch(a){
                case 1:
                System.out.println("情况1");
                break;
                case 2:
                System.out.println("情况2");  //注意：当a = 2时，case2下面没有break,则执行完情况2，还会接着执行情况3
                case 3:
                System.out.println("情况3");
                break;
                default:
                System.out.println("情况default");
                break;

            }





            






    }
}
