package homeworkenum;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        Days days = Days.valueOf(word.toUpperCase());
        switch (days) {
            case MONDAY -> System.out.println(Days.MONDAY.getName()+" куну техникалык жава сабагын окуймун");
            case TUESDAY -> System.out.println(Days.TUESDAY.getName()+" куну англис тили жана практикалык жава сабактарын окуймун");
            case WEDNESDAY -> System.out.println(Days.WEDNESDAY.getName()+" куну техникалык жава сабагын окуймун");
            case THURSDAY -> System.out.println(Days.THURSDAY.getName()+" куну soft-skills жана практикалык жава сабактарын окуймун");
            case FRIDAY -> System.out.println(Days.FRIDAY.getName()+" куну техникалык жава окуймун");
            case SATURDAY -> System.out.println(Days.SATURDAY.getName()+" куну практикалык жава сабагын окймун");
            case SUNDAY -> System.out.println(Days.SUNDAY.getName()+" куну дем аламын");

        }
    }
}
