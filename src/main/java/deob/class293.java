package deob;

import java.util.Calendar;
import java.util.HashMap;
import java.util.TimeZone;

@class305
@ObfuscatedName("lu")
public final class class293 {

    @ObfuscatedName("lu.aw")
    public static final HashMap field3359 = new HashMap();

    static {
        Calendar.getInstance(method5165("Europe/London"));
    }

    public class293() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("lu.af(Ljava/lang/String;I)Ljava/util/TimeZone;")
    public static TimeZone method5165(String arg0) {
        HashMap var1 = field3359;
        synchronized (field3359) {
            TimeZone var2 = (TimeZone) field3359.get(arg0);
            if (var2 == null) {
                var2 = TimeZone.getTimeZone(arg0);
                field3359.put(arg0, var2);
            }
            return var2;
        }
    }
}
