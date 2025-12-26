public class homework {
    public static void main(String[] args) {
        // 使用char类型，分别保存\n \t \r \\ 1 2 3 等字符，并打印输出
        char c1 = '\n';
        char c2 = '\t';
        char c3 = '\r';
        char c4 = '\\';
        char c5 = '1';
        char c6 = '2';
        char c7 = '3';
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);
        System.out.println(c6);
        System.out.println(c7);
        System.out.println("=======================");

// 编程，保存两本书名，用+拼接，看效果。保存两个性别，用加号拼接，看效果。
// 保存两本书价格，用加号拼接，看效果
        String s1 = "西游记";
        String s2 = "红楼梦";
        String s3 = s1 + s2;
        System.out.println(s3);

        String s4 = "male";
        String s5 = "female";
        String s6 = s4 + s5;
        System.out.println(s6);

        String s7 = "180";
        String s8 = "35";
        String s9 = s7 + s8;
        System.out.println(s9);

        /*
         * 4.编程实现如下效果Homework04.java
姓名  年龄  成绩  性别  爱好
XX    XX     XX   XX    XX
要求：
1)用变量将姓名、年龄、成绩、性别、爱好存储
2)使用+
3)添加适当的注释
4)添加转义字符，使用一条语句输出
         */

        String name = "Jack";
        int age = 24;
        double score = 98.5;
        char sex = '男';
        String hobby = "编程";
        System.out.println("姓名" + '\t' +"年龄" + '\t' + "成绩" + '\t' + "性别" + '\t' + "爱好" + 
        '\n' + name + '\t' + age + '\t' + score + '\t' + sex + '\t' + hobby);

        System.out.println("姓名\t年龄\t成绩\t性别\t爱好\n" + 
        name + '\t' + age + '\t' + score + '\t' + sex + '\t' + hobby);
    }

}
