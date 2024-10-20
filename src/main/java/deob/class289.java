package deob;

import java.util.Calendar;
import java.util.HashMap;
import java.util.TimeZone;

@class301
@ObfuscatedName("lv")
public final class class289 {

    @ObfuscatedName("lv.ac")
    public static final HashMap field3301 = new HashMap();

    static {
        Calendar.getInstance(method4965("Europe/London"));
    }

    public class289() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("lv.aj(Ljava/lang/String;I)Ljava/util/TimeZone;")
    public static TimeZone method4965(String arg0) {
        HashMap var1 = field3301;
        synchronized (field3301) {
            TimeZone var2 = (TimeZone) field3301.get(arg0);
            if (var2 == null) {
                var2 = TimeZone.getTimeZone(arg0);
                field3301.put(arg0, var2);
            }
            return var2;
        }
    }
}
