import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     /*   CHUI("В Чуе находится столица страны"),
                TALAS("В Таласе родился Манас"),
                NARYN("В Нарыне проживают яки"),
                OSH("В Оше готовят вкусный плов"),
                JALALABAD("В Джалал-Абаде готовят вкусные самсы"),
                BATKEN("В Баткене выращивают вкусный персики"),
                YSSYKKOL("В Иссык-кульской области находится жемчужина Кыргызстана - озеро Иссык-куль");*/
        Scanner sc=new Scanner(System.in);
        String word=sc.nextLine();
        Region regions=Region.valueOf(word);
        switch(regions){
            case CHUI:
                System.out.println("В Чуе находится столица страны");
                break;
            case TALAS:
                System.out.println("В Таласе родился Манас");
                break;
            case NARYN:
                System.out.println("В Нарыне проживают яки");
                break;
            case OSH:
                System.out.println("В Оше готовят вкусный плов");
                break;
            case JALALABAD:
                System.out.println("В Джалал-Абаде готовят вкусные самсы");
                break;
            case BATKEN:
                System.out.println("В Баткене выращивают вкусные персики");
                break;
            case YSSYKKOL:
                System.out.println("В Иссык-кульской области находится жемчужина Кыргызстана - озеро Иссык-куль");
        }
       Region reg= Region.valueOf(Region.OSH.name());
        System.out.println(reg);

        try{
            System.out.println(12/0);
        } catch (ArithmeticException e) {
            System.out.println("Не делится на ноль");
        }
    }
}
