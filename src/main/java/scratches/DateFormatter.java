package scratches;

import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.util.Date;
import java.util.TimeZone;

public class DateFormatter {

  public static void main(String[] args) {
    Date d = new Date(1670037101000L);
      SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZZZ");
      format.setTimeZone(TimeZone.getTimeZone(ZoneId.of("UTC")));
    System.out.println(format.format(d));
    format.setTimeZone(TimeZone.getTimeZone(ZoneId.SHORT_IDS.get("CTT")));
    System.out.println(format.format(d));

  }
}
