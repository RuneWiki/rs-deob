package deob;

import java.util.Calendar;
import java.util.HashMap;
import java.util.TimeZone;

@class282
@ObfuscatedName("jt")
public final class class270 {

    @ObfuscatedName("jt.f")
    public static final HashMap field3193 = new HashMap();

    static {
        Calendar.getInstance(method4822("Europe/London"));
    }

    public class270() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("jt.c(Ljava/lang/String;B)Ljava/util/TimeZone;")
    public static TimeZone method4822(String arg0) {
        HashMap var1 = field3193;
        synchronized (field3193) {
            TimeZone var2 = (TimeZone) field3193.get(arg0);
            if (var2 == null) {
                var2 = TimeZone.getTimeZone(arg0);
                field3193.put(arg0, var2);
            }
            return var2;
        }
    }
}
