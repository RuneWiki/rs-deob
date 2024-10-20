package deob;

import java.util.Calendar;
import java.util.HashMap;
import java.util.TimeZone;

@class349
@ObfuscatedName("mf")
public final class class330 {

    @ObfuscatedName("mf.ag")
    public static final HashMap field3592 = new HashMap();

    static {
        HashMap var0 = field3592;
        TimeZone var2;
        synchronized (field3592) {
            TimeZone var1 = (TimeZone) field3592.get("Europe/London");
            if (var1 == null) {
                var1 = TimeZone.getTimeZone("Europe/London");
                field3592.put("Europe/London", var1);
            }
            var2 = var1;
        }
        Calendar.getInstance(var2);
    }

    public class330() throws Throwable {
        throw new Error();
    }
}
