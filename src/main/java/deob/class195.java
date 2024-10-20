package deob;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

@ObfuscatedName("ga")
public class class195 {

    @ObfuscatedName("ga.c")
    public static final String[][] field2432 = new String[][] { { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" } };

    @ObfuscatedName("ga.q")
    public static final String[] field2431 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @ObfuscatedName("ga.m")
    public static Calendar field2433;

    static {
        Calendar.getInstance(TimeZone.getTimeZone("Europe/London"));
        field2433 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }

    public class195() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("hp.c(J)Ljava/lang/String;")
    public static String method4085(long arg0) {
        field2433.setTime(new Date(arg0));
        int var2 = field2433.get(7);
        int var3 = field2433.get(5);
        int var4 = field2433.get(2);
        int var5 = field2433.get(1);
        int var6 = field2433.get(11);
        int var7 = field2433.get(12);
        int var8 = field2433.get(13);
        return field2431[var2 - 1] + ", " + var3 / 10 + var3 % 10 + "-" + field2432[0][var4] + "-" + var5 + " " + var6 / 10 + var6 % 10 + ":" + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + " GMT";
    }
}
