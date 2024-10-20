package deob;

import java.util.Calendar;
import java.util.HashMap;
import java.util.TimeZone;

@class334
@ObfuscatedName("mj")
public final class class315 {

    @ObfuscatedName("mj.ak")
    public static final HashMap field3403 = new HashMap();

    static {
        Calendar.getInstance(method5339("Europe/London"));
    }

    public class315() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("mj.ac(Ljava/lang/String;I)Ljava/util/TimeZone;")
    public static TimeZone method5339(String arg0) {
        HashMap var1 = field3403;
        synchronized (field3403) {
            TimeZone var2 = (TimeZone) field3403.get(arg0);
            if (var2 == null) {
                var2 = TimeZone.getTimeZone(arg0);
                field3403.put(arg0, var2);
            }
            return var2;
        }
    }
}
