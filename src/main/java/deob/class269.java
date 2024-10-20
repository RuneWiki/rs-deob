package deob;

import java.util.Calendar;
import java.util.HashMap;
import java.util.TimeZone;

@class281
@ObfuscatedName("ju")
public final class class269 {

    @ObfuscatedName("ju.l")
    public static final HashMap field3209 = new HashMap();

    static {
        HashMap var0 = field3209;
        TimeZone var2;
        synchronized (field3209) {
            TimeZone var1 = (TimeZone) field3209.get("Europe/London");
            if (var1 == null) {
                var1 = TimeZone.getTimeZone("Europe/London");
                field3209.put("Europe/London", var1);
            }
            var2 = var1;
        }
        Calendar.getInstance(var2);
    }

    public class269() throws Throwable {
        throw new Error();
    }
}
