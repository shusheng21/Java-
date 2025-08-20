package charpter04;
import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        String name;
        int age;
        double salary;
        Scanner mysc = new Scanner(System.in);
        System.out.println("请输入姓名：");
        name = mysc.next();
        System.out.println("请输入年龄：");
        age = mysc.nextInt();
        System.out.println("请输入工资：");
        salary = mysc.nextDouble();
        System.out.println("-----------------------------");
        System.out.println("姓名\t年龄\t工资\n" + name + '\t' + age + '\t' + salary);

    }
}
