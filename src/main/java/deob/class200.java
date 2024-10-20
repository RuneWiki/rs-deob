package deob;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

@ObfuscatedName("gs")
public class class200 {

    @ObfuscatedName("gs.n")
    public static final String[][] field2470 = new String[][] { { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" } };

    @ObfuscatedName("gs.h")
    public static final String[] field2467 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @ObfuscatedName("gs.l")
    public static Calendar field2469;

    static {
        Calendar.getInstance(TimeZone.getTimeZone("Europe/London"));
        field2469 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }

    public class200() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cf.n(J)Ljava/lang/String;")
    public static String method1854(long arg0) {
        field2469.setTime(new Date(arg0));
        int var2 = field2469.get(7);
        int var3 = field2469.get(5);
        int var4 = field2469.get(2);
        int var5 = field2469.get(1);
        int var6 = field2469.get(11);
        int var7 = field2469.get(12);
        int var8 = field2469.get(13);
        return field2467[var2 - 1] + ", " + var3 / 10 + var3 % 10 + "-" + field2470[0][var4] + "-" + var5 + " " + var6 / 10 + var6 % 10 + ":" + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + " GMT";
    }
}
