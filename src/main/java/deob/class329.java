package deob;

import java.util.Calendar;
import java.util.HashMap;
import java.util.TimeZone;

@class348
@ObfuscatedName("mz")
public final class class329 {

    @ObfuscatedName("mz.ak")
    public static final HashMap field3599 = new HashMap();

    static {
        HashMap var0 = field3599;
        TimeZone var2;
        synchronized (field3599) {
            TimeZone var1 = (TimeZone) field3599.get("Europe/London");
            if (var1 == null) {
                var1 = TimeZone.getTimeZone("Europe/London");
                field3599.put("Europe/London", var1);
            }
            var2 = var1;
        }
        Calendar.getInstance(var2);
    }

    public class329() throws Throwable {
        throw new Error();
    }
}
