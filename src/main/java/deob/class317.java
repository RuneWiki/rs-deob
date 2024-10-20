package deob;

import java.util.Calendar;
import java.util.HashMap;
import java.util.TimeZone;

@class336
@ObfuscatedName("ma")
public final class class317 {

    @ObfuscatedName("ma.af")
    public static final HashMap field3467 = new HashMap();

    static {
        HashMap var0 = field3467;
        TimeZone var2;
        synchronized (field3467) {
            TimeZone var1 = (TimeZone) field3467.get("Europe/London");
            if (var1 == null) {
                var1 = TimeZone.getTimeZone("Europe/London");
                field3467.put("Europe/London", var1);
            }
            var2 = var1;
        }
        Calendar.getInstance(var2);
    }

    public class317() throws Throwable {
        throw new Error();
    }
}
