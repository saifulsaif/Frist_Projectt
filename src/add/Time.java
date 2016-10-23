/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package add;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 *
 * @author DIU
 */
public class Time {
    Time()
    {
        double Timezone;
        Date date = new Date();
        int GMT;
        TimeZone.setDefault(TimeZone.getTimeZone("GMT"));
        Calendar cal = Calendar.getInstance(TimeZone.getDefault());
        date = calendar.getTime();
    }
   
    
}
