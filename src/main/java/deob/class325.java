package deob;

import java.util.Calendar;
import java.util.HashMap;
import java.util.TimeZone;

@class344
@ObfuscatedName("me")
public final class class325 {

    @ObfuscatedName("me.aj")
    public static final HashMap field3551 = new HashMap();

    static {
        HashMap var0 = field3551;
        TimeZone var2;
        synchronized (field3551) {
            TimeZone var1 = (TimeZone) field3551.get("Europe/London");
            if (var1 == null) {
                var1 = TimeZone.getTimeZone("Europe/London");
                field3551.put("Europe/London", var1);
            }
            var2 = var1;
        }
        Calendar.getInstance(var2);
    }

    public class325() throws Throwable {
        throw new Error();
    }
}
