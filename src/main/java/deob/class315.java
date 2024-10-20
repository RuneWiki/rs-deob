package deob;

import java.util.Calendar;
import java.util.HashMap;
import java.util.TimeZone;

@class334
@ObfuscatedName("md")
public final class class315 {

    @ObfuscatedName("md.af")
    public static final HashMap field3428 = new HashMap();

    static {
        Calendar.getInstance(method5433("Europe/London"));
    }

    public class315() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("md.am(Ljava/lang/String;I)Ljava/util/TimeZone;")
    public static TimeZone method5433(String arg0) {
        HashMap var1 = field3428;
        synchronized (field3428) {
            TimeZone var2 = (TimeZone) field3428.get(arg0);
            if (var2 == null) {
                var2 = TimeZone.getTimeZone(arg0);
                field3428.put(arg0, var2);
            }
            return var2;
        }
    }
}
