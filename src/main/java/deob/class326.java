package deob;

import java.util.Calendar;
import java.util.HashMap;
import java.util.TimeZone;

@class345
@ObfuscatedName("mh")
public final class class326 {

    @ObfuscatedName("mh.ag")
    public static final HashMap field3550 = new HashMap();

    static {
        HashMap var0 = field3550;
        TimeZone var2;
        synchronized (field3550) {
            TimeZone var1 = (TimeZone) field3550.get("Europe/London");
            if (var1 == null) {
                var1 = TimeZone.getTimeZone("Europe/London");
                field3550.put("Europe/London", var1);
            }
            var2 = var1;
        }
        Calendar.getInstance(var2);
    }

    public class326() throws Throwable {
        throw new Error();
    }
}
