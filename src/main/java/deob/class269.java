package deob;

import java.util.Calendar;
import java.util.HashMap;
import java.util.TimeZone;

@Deprecated
@class281
@ObfuscatedName("ji")
public final class class269 {

    @ObfuscatedName("ji.w")
    public static final HashMap field3169 = new HashMap();

    static {
        HashMap var0 = field3169;
        TimeZone var2;
        synchronized (field3169) {
            TimeZone var1 = (TimeZone) field3169.get("Europe/London");
            if (var1 == null) {
                var1 = TimeZone.getTimeZone("Europe/London");
                field3169.put("Europe/London", var1);
            }
            var2 = var1;
        }
        Calendar.getInstance(var2);
    }

    public class269() throws Throwable {
        throw new Error();
    }
}
