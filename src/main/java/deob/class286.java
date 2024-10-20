package deob;

import java.util.Calendar;
import java.util.HashMap;
import java.util.TimeZone;

@class298
@ObfuscatedName("jk")
public final class class286 {

    @ObfuscatedName("jk.v")
    public static final HashMap field3325 = new HashMap();

    static {
        Calendar.getInstance(method5072("Europe/London"));
    }

    public class286() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("jk.f(Ljava/lang/String;I)Ljava/util/TimeZone;")
    public static TimeZone method5072(String arg0) {
        HashMap var1 = field3325;
        synchronized (field3325) {
            TimeZone var2 = (TimeZone) field3325.get(arg0);
            if (var2 == null) {
                var2 = TimeZone.getTimeZone(arg0);
                field3325.put(arg0, var2);
            }
            return var2;
        }
    }
}
