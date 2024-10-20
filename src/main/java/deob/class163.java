package deob;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

@ObfuscatedName("fu")
public class class163 {

    @ObfuscatedName("fu.o")
    public static final String[][] field2157 = new String[][] { { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" } };

    @ObfuscatedName("fu.m")
    public static final String[] field2158 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @ObfuscatedName("fu.b")
    public static Calendar field2159;

    static {
        Calendar.getInstance(TimeZone.getTimeZone("Europe/London"));
        field2159 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }

    public class163() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ac.o(J)Ljava/lang/String;")
    public static String method724(long arg0) {
        field2159.setTime(new Date(arg0));
        int var2 = field2159.get(7);
        int var3 = field2159.get(5);
        int var4 = field2159.get(2);
        int var5 = field2159.get(1);
        int var6 = field2159.get(11);
        int var7 = field2159.get(12);
        int var8 = field2159.get(13);
        return field2158[var2 - 1] + ", " + var3 / 10 + var3 % 10 + "-" + field2157[0][var4] + "-" + var5 + " " + var6 / 10 + var6 % 10 + ":" + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + " GMT";
    }
}
