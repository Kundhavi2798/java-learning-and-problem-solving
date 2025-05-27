import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Set;
import java.util.Calendar;

public class calenderDataTime{

    public static void main(String[] args) {
        Calendar calen = Calendar.getInstance();
        calen.set(Calendar.YEAR,1998);
        calen.set(Calendar.MONTH,8);
        calen.set(Calendar.DATE, 27);
        calen.set(Calendar.HOUR_OF_DAY, 0);
        calen.set(Calendar.MINUTE, 0);
        calen.set(Calendar.SECOND, 0);
        Date date = calen.getTime();
        System.out.println(date);

        // add i can add the years and month in set values
        calen.add(Calendar.YEAR, 2);
        calen.add(Calendar.MONTH, 1);
        System.out.println("After adding years and Month:"+ calen.getTime());

        //Is after check -> if compare the two values and if after or not
        Calendar calen2 = Calendar.getInstance();
        calen2.set(2023, Calendar.AUGUST,2);
        System.out.println("2nd date : "+ calen2.getTime());

        Boolean isAfter = calen2.after(calen);
        System.out.println(isAfter);

        // check before also in same pattern
        boolean isBefore = calen2.before(calen);
        System.out.println(isBefore);
        //After use clear we get defualt data Thu Jan 01 00:00:00 IST 1970
        calen2.clear();
        System.out.println("after clear in calen2:"+ calen2.getTime());

        //copy the calender values using clone
        Calendar copyCalenderValue =(Calendar) calen.clone();
        System.out.println(copyCalenderValue.getTime());

        //comparing two datas using campareTo
        /*The method returns 0 if the otherCalendar is equal to the myCalendar object.
            The method returns 1 if the time of the myCalendar object is ahead of the otherCalendar object.
            The method returns -1 if the time of the myCalendar object is behind the otherCalendar object. */
        int val = calen2.compareTo(calen);
        System.out.println(val);
        Calendar calen3 = new GregorianCalendar();
        val = calen3.compareTo(calen);
        System.out.println("Check with Current value :"+ val);
     
        Calendar cal = new GregorianCalendar();
        System.out.println(cal.getTime());

        cal.set(GregorianCalendar.MONTH, 1);
        // complete and computefield is producted in calender we cant directly call its called defualtly in getTime()

        //Equals -> check two time is equals
        boolean isequal = calen2.equals(cal);
        System.out.println("The two time is "+ isequal);

        //get to get the perticular details
        System.out.println(cal.get(Calendar.YEAR));
        //get the Actualmaxi days in that fields
        int maxDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
        int maxDay2 = cal.getActualMaximum(Calendar.DAY_OF_YEAR);
        System.out.println(maxDay + maxDay2);

        //get the Actualmin days in that fields
        int minDay = cal.getActualMinimum(Calendar.YEAR);
        int minDay2 = cal.getActualMinimum(Calendar.MONTH);
        System.out.println("Minimum"+minDay + minDay2);

        //get the type of calenders

        Set getTypes = Calendar.getAvailableCalendarTypes();

        for (Object values : getTypes){
            System.out.println(values);
        }

        //get available locale
        Locale[] availableLocal = Calendar.getAvailableLocales();
        System.out.println("The List of locale");
        for (Locale List : availableLocal){
            System.out.println(List);
        }

        //Calender Type of assigned values
        String currentType = cal.getCalendarType();
        System.out.println(currentType);

        // Get the display name for the month in the current locale.
        String displayName = cal.getDisplayName(Calendar.MONTH, Calendar.SHORT, Locale.getDefault());
        System.out.println(displayName);
        

    }
}