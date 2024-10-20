package deob;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

@ObfuscatedName("gh")
public class class194 {

    @ObfuscatedName("gh.s")
    public static final String[][] field2556 = new String[][] { { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" } };

    @ObfuscatedName("gh.g")
    public static final String[] field2555 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @ObfuscatedName("gh.m")
    public static Calendar field2554;

    static {
        Calendar.getInstance(TimeZone.getTimeZone("Europe/London"));
        field2554 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }

    public class194() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cs.s(J)Ljava/lang/String;")
    public static String method1960(long arg0) {
        field2554.setTime(new Date(arg0));
        int var2 = field2554.get(7);
        int var3 = field2554.get(5);
        int var4 = field2554.get(2);
        int var5 = field2554.get(1);
        int var6 = field2554.get(11);
        int var7 = field2554.get(12);
        int var8 = field2554.get(13);
        return field2555[var2 - 1] + ", " + var3 / 10 + var3 % 10 + "-" + field2556[0][var4] + "-" + var5 + " " + var6 / 10 + var6 % 10 + ":" + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + " GMT";
    }
}
