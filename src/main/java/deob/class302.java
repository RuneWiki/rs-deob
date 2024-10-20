package deob;

import java.util.Calendar;
import java.util.HashMap;
import java.util.TimeZone;

@class321
@ObfuscatedName("lt")
public final class class302 {

    @ObfuscatedName("lt.ar")
    public static final HashMap field3363 = new HashMap();

    static {
        Calendar.getInstance(method5183("Europe/London"));
    }

    public class302() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("lt.aw(Ljava/lang/String;S)Ljava/util/TimeZone;")
    public static TimeZone method5183(String arg0) {
        HashMap var1 = field3363;
        synchronized (field3363) {
            TimeZone var2 = (TimeZone) field3363.get(arg0);
            if (var2 == null) {
                var2 = TimeZone.getTimeZone(arg0);
                field3363.put(arg0, var2);
            }
            return var2;
        }
    }
}
