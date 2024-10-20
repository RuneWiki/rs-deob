package deob;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

@ObfuscatedName("fu")
public class class163 {

    @ObfuscatedName("fu.f")
    public static final String[][] field2169 = new String[][] { { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" } };

    @ObfuscatedName("fu.i")
    public static final String[] field2165 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @ObfuscatedName("fu.u")
    public static Calendar field2166;

    static {
        Calendar.getInstance(TimeZone.getTimeZone("Europe/London"));
        field2166 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }

    public class163() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ae.f(J)Ljava/lang/String;")
    public static String method821(long arg0) {
        field2166.setTime(new Date(arg0));
        int var2 = field2166.get(7);
        int var3 = field2166.get(5);
        int var4 = field2166.get(2);
        int var5 = field2166.get(1);
        int var6 = field2166.get(11);
        int var7 = field2166.get(12);
        int var8 = field2166.get(13);
        return field2165[var2 - 1] + ", " + var3 / 10 + var3 % 10 + "-" + field2169[0][var4] + "-" + var5 + " " + var6 / 10 + var6 % 10 + ":" + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + " GMT";
    }
}
