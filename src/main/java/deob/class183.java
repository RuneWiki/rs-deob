package deob;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

@ObfuscatedName("gw")
public class class183 {

    @ObfuscatedName("gw.n")
    public static final String[][] field2453 = new String[][] { { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" } };

    @ObfuscatedName("gw.p")
    public static final String[] field2452 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @ObfuscatedName("gw.i")
    public static Calendar field2458;

    static {
        Calendar.getInstance(TimeZone.getTimeZone("Europe/London"));
        field2458 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }

    public class183() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dj.n(J)Ljava/lang/String;")
    public static String method2223(long arg0) {
        field2458.setTime(new Date(arg0));
        int var2 = field2458.get(7);
        int var3 = field2458.get(5);
        int var4 = field2458.get(2);
        int var5 = field2458.get(1);
        int var6 = field2458.get(11);
        int var7 = field2458.get(12);
        int var8 = field2458.get(13);
        return field2452[var2 - 1] + ", " + var3 / 10 + var3 % 10 + "-" + field2453[0][var4] + "-" + var5 + " " + var6 / 10 + var6 % 10 + ":" + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + " GMT";
    }
}
