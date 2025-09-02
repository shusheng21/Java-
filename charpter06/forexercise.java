package charpter06;
import java.util.Scanner;

public class forexercise {
    public static void main(String[] args) {
        // //打印
        // for(int i = 1; i <= 9; i++){
        //     for(int j = 1; j <= i; j++){
        //         System.out.print(j + "*" + i + "=" + i*j + " ");
        //         //System.out.println(i + '*' + j + '=' + i*j);
        //     }
        //     System.out.println("");
        // }
        Scanner MyScanner = new Scanner(System.in);
        System.out.println("请输入层数");
        int num = MyScanner.nextInt();
        // for(int i = 0; i < num; i++){
        //     for(int k = 0; k < num - i - 1; k++){
        //         System.out.print(" ");
        //     }
        //     for(int j = 1; j <= 2*(i+1)-1; j++){
                
        //         System.out.print("*");    
        //     }
        //     System.out.println("");
        // }

        for(int i = 0; i < num; i++){
            for(int k = 0; k < num - i - 1; k++){
                System.out.print(" ");
            }
            for(int j = 1; j <= 2*(i+1)-1; j++){
                if(j == 1 || j == 2*(i+1)-1 || i == num-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" "); 
                }   
            }
            System.out.println("");
        }









    }
}

