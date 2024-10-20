package deob;

import java.util.Calendar;
import java.util.HashMap;
import java.util.TimeZone;

@class280
@ObfuscatedName("jl")
public final class class268 {

    @ObfuscatedName("jl.q")
    public static final HashMap field3163 = new HashMap();

    static {
        HashMap var0 = field3163;
        TimeZone var2;
        synchronized (field3163) {
            TimeZone var1 = (TimeZone) field3163.get("Europe/London");
            if (var1 == null) {
                var1 = TimeZone.getTimeZone("Europe/London");
                field3163.put("Europe/London", var1);
            }
            var2 = var1;
        }
        Calendar.getInstance(var2);
    }

    public class268() throws Throwable {
        throw new Error();
    }
}
