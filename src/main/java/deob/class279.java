package deob;

import java.util.Calendar;
import java.util.HashMap;
import java.util.TimeZone;

@class291
@ObfuscatedName("jd")
public final class class279 {

    @ObfuscatedName("jd.c")
    public static final HashMap field3261 = new HashMap();

    static {
        HashMap var0 = field3261;
        TimeZone var2;
        synchronized (field3261) {
            TimeZone var1 = (TimeZone) field3261.get("Europe/London");
            if (var1 == null) {
                var1 = TimeZone.getTimeZone("Europe/London");
                field3261.put("Europe/London", var1);
            }
            var2 = var1;
        }
        Calendar.getInstance(var2);
    }

    public class279() throws Throwable {
        throw new Error();
    }
}
