package deob;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

@ObfuscatedName("gc")
public class class200 {

    @ObfuscatedName("gc.a")
    public static final String[][] field2481 = new String[][] { { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" } };

    @ObfuscatedName("gc.s")
    public static final String[] field2476 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @ObfuscatedName("gc.g")
    public static Calendar field2477;

    static {
        Calendar.getInstance(TimeZone.getTimeZone("Europe/London"));
        field2477 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }

    public class200() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("s.a(J)Ljava/lang/String;")
    public static String method21(long arg0) {
        field2477.setTime(new Date(arg0));
        int var2 = field2477.get(7);
        int var3 = field2477.get(5);
        int var4 = field2477.get(2);
        int var5 = field2477.get(1);
        int var6 = field2477.get(11);
        int var7 = field2477.get(12);
        int var8 = field2477.get(13);
        return field2476[var2 - 1] + ", " + var3 / 10 + var3 % 10 + "-" + field2481[0][var4] + "-" + var5 + " " + var6 / 10 + var6 % 10 + ":" + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + " GMT";
    }
}
