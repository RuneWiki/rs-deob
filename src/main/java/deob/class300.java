package deob;

import java.util.Calendar;
import java.util.HashMap;
import java.util.TimeZone;

@class318
@ObfuscatedName("ls")
public final class class300 {

    @ObfuscatedName("ls.av")
    public static final HashMap field3357 = new HashMap();

    static {
        HashMap var0 = field3357;
        TimeZone var2;
        synchronized (field3357) {
            TimeZone var1 = (TimeZone) field3357.get("Europe/London");
            if (var1 == null) {
                var1 = TimeZone.getTimeZone("Europe/London");
                field3357.put("Europe/London", var1);
            }
            var2 = var1;
        }
        Calendar.getInstance(var2);
    }

    public class300() throws Throwable {
        throw new Error();
    }
}
