package deob;

import java.util.Calendar;
import java.util.HashMap;
import java.util.TimeZone;

@class347
@ObfuscatedName("mp")
public final class class328 {

    @ObfuscatedName("mp.an")
    public static final HashMap field3538 = new HashMap();

    static {
        HashMap var0 = field3538;
        TimeZone var2;
        synchronized (field3538) {
            TimeZone var1 = (TimeZone) field3538.get("Europe/London");
            if (var1 == null) {
                var1 = TimeZone.getTimeZone("Europe/London");
                field3538.put("Europe/London", var1);
            }
            var2 = var1;
        }
        Calendar.getInstance(var2);
    }

    public class328() throws Throwable {
        throw new Error();
    }
}
