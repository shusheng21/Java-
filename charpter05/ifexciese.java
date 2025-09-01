package charpter05;

public class ifexciese {
    public static void main(String[] args){
        int years = 2001;
        for(int i = 0; i < 30;i++,years++){
            if((years % 4 == 0 && years % 100 != 00)||years % 400 == 0){
                System.out.println(years + "年是闰年");
            }
        }
    }

}