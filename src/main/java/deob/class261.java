package deob;

import java.util.Calendar;
import java.util.HashMap;
import java.util.TimeZone;

@class273
@ObfuscatedName("jh")
public final class class261 {

    @ObfuscatedName("jh.s")
    public static final HashMap field3082 = new HashMap();

    static {
        HashMap var0 = field3082;
        TimeZone var2;
        synchronized (field3082) {
            TimeZone var1 = (TimeZone) field3082.get("Europe/London");
            if (var1 == null) {
                var1 = TimeZone.getTimeZone("Europe/London");
                field3082.put("Europe/London", var1);
            }
            var2 = var1;
        }
        Calendar.getInstance(var2);
    }

    public class261() throws Throwable {
        throw new Error();
    }
}
