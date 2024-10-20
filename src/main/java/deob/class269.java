package deob;

import java.util.Calendar;
import java.util.HashMap;
import java.util.TimeZone;

@ObfuscatedName("jr")
public final class class269 {

    @ObfuscatedName("jr.i")
    public static final HashMap field3143 = new HashMap();

    static {
        Calendar.getInstance(method4685("Europe/London"));
    }

    public class269() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("jr.v(Ljava/lang/String;I)Ljava/util/TimeZone;")
    public static TimeZone method4685(String arg0) {
        HashMap var1 = field3143;
        synchronized (field3143) {
            TimeZone var2 = (TimeZone) field3143.get(arg0);
            if (var2 == null) {
                var2 = TimeZone.getTimeZone(arg0);
                field3143.put(arg0, var2);
            }
            return var2;
        }
    }
}
