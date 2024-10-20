package deob;

import java.util.Calendar;
import java.util.HashMap;
import java.util.TimeZone;

@class331
@ObfuscatedName("lt")
public final class class312 {

    @ObfuscatedName("lt.ar")
    public static final HashMap field3393 = new HashMap();

    static {
        HashMap var0 = field3393;
        TimeZone var2;
        synchronized (field3393) {
            TimeZone var1 = (TimeZone) field3393.get("Europe/London");
            if (var1 == null) {
                var1 = TimeZone.getTimeZone("Europe/London");
                field3393.put("Europe/London", var1);
            }
            var2 = var1;
        }
        Calendar.getInstance(var2);
    }

    public class312() throws Throwable {
        throw new Error();
    }
}
