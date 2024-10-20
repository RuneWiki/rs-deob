package deob;

import java.util.Calendar;
import java.util.HashMap;
import java.util.TimeZone;

@class320
@ObfuscatedName("lc")
public final class class301 {

    @ObfuscatedName("lc.ao")
    public static final HashMap field3373 = new HashMap();

    static {
        HashMap var0 = field3373;
        TimeZone var2;
        synchronized (field3373) {
            TimeZone var1 = (TimeZone) field3373.get("Europe/London");
            if (var1 == null) {
                var1 = TimeZone.getTimeZone("Europe/London");
                field3373.put("Europe/London", var1);
            }
            var2 = var1;
        }
        Calendar.getInstance(var2);
    }

    public class301() throws Throwable {
        throw new Error();
    }
}
