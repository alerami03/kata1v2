package kata1v2;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Person {
    
    private final String name;
    private final Calendar birthday;
    private static final long MILLISECOND_PER_YEAR = (long) (365.25 * 24 * 60 * 60 * 1000);

    public Person(String name, Calendar birthday) {
        this.name = name;
        this.birthday = birthday;
    }
    
    public String getName() {
        return name;
    }

    public Calendar getBirthday() {
        return birthday;
    }

    public static long getMILLISECOND_PER_YEAR() {
        return MILLISECOND_PER_YEAR;
    }
    
    public int getAGE(){
        Calendar today;
        today = GregorianCalendar.getInstance();
        
        return (int) (milliSecondToYear(today.getTimeInMillis() - birthday.getTimeInMillis()));
        
    }
    
    public long milliSecondToYear(long milles){
        return milles/ MILLISECOND_PER_YEAR;
    }
    
}
