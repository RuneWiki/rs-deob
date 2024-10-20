package deob;

import java.util.Calendar;
import java.util.HashMap;
import java.util.TimeZone;

@class294
@ObfuscatedName("jg")
public final class class282 {

    @ObfuscatedName("jg.v")
    public static final HashMap field3319 = new HashMap();

    static {
        Calendar.getInstance(method4957("Europe/London"));
    }

    public class282() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("jg.h(Ljava/lang/String;I)Ljava/util/TimeZone;")
    public static TimeZone method4957(String arg0) {
        HashMap var1 = field3319;
        synchronized (field3319) {
            TimeZone var2 = (TimeZone) field3319.get(arg0);
            if (var2 == null) {
                var2 = TimeZone.getTimeZone(arg0);
                field3319.put(arg0, var2);
            }
            return var2;
        }
    }
}
