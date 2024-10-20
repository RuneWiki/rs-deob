package deob;

import java.util.Calendar;
import java.util.HashMap;
import java.util.TimeZone;

@class336
@ObfuscatedName("mi")
public final class class317 {

    @ObfuscatedName("mi.al")
    public static final HashMap field3445 = new HashMap();

    static {
        Calendar.getInstance(method5457("Europe/London"));
    }

    public class317() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("mi.aq(Ljava/lang/String;I)Ljava/util/TimeZone;")
    public static TimeZone method5457(String arg0) {
        HashMap var1 = field3445;
        synchronized (field3445) {
            TimeZone var2 = (TimeZone) field3445.get(arg0);
            if (var2 == null) {
                var2 = TimeZone.getTimeZone(arg0);
                field3445.put(arg0, var2);
            }
            return var2;
        }
    }
}
