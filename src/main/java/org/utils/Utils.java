package org.utils;

import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;

public class Utils {

    //private Map<String, App> appMap = Collections.emptyMap();
    //private List<Calendar> calendar = Collections.emptyList();


    // получение элемента Map по его индексу
    public static <K, V> Map.Entry<K, V> getEntryByIndex(Map<K, V> map, int index) {
        if (index < 0 || map.size() <= index) {
            throw new IndexOutOfBoundsException("индекс выходит за границы");
        }
        Map.Entry<K, V> e = null;
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (0 <= index--) {
            e = it.next();
        }
        return e;
    }

    //Проверка является ли дата текущим днем
    public static Boolean isToday(LocalDateTime date) {
        Boolean result = false;
        LocalDateTime ldt = LocalDateTime.now();

        if (ldt.getYear()==date.getYear()&&
                ldt.getMonth()==date.getMonth()&&
                ldt.getDayOfMonth()==date.getDayOfMonth()) {
            result = true;
        }
        return result;

    }

    public static boolean isToday(Date date){
        Calendar today = Calendar.getInstance();
        Calendar specifiedDate  = Calendar.getInstance();
        specifiedDate.setTime(date);

        return today.get(Calendar.DAY_OF_MONTH) == specifiedDate.get(Calendar.DAY_OF_MONTH)
                &&  today.get(Calendar.MONTH) == specifiedDate.get(Calendar.MONTH)
                &&  today.get(Calendar.YEAR) == specifiedDate.get(Calendar.YEAR);
    }



/*    List<EventLog> elList = elService.getListEventLogForNL(nl, ColorScheme.HAS_NOT_KT)
            .stream()
            .filter(asd -> UtilsDateTime.isToday(asd.getBpStepDt())).collect(Collectors.toList());*/



    /**
     * Определение является ли текущий день выходным
     * */
/*    public static boolean isWeekday() {
        List<LCalendar> calendarList = systemDirectoryData.getCalendar();

        String dateString = LocalDate.now().toString();
        LCalendar dateForCompare = new LCalendar(dateString, true);

        Boolean result = false;
//если дата найдена, то это выходной день
        if (calendarList.indexOf(dateForCompare) > 0) {
            result = true;
        }
        return result;
    }*/

}
