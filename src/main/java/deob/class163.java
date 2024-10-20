package deob;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

@ObfuscatedName("fo")
public class class163 {

    @ObfuscatedName("fo.x")
    public static final String[][] field2135 = new String[][] { { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" } };

    @ObfuscatedName("fo.j")
    public static final String[] field2136 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @ObfuscatedName("fo.c")
    public static Calendar field2137;

    static {
        Calendar.getInstance(TimeZone.getTimeZone("Europe/London"));
        field2137 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }

    public class163() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ez.x(J)Ljava/lang/String;")
    public static String method2608(long arg0) {
        field2137.setTime(new Date(arg0));
        int var2 = field2137.get(7);
        int var3 = field2137.get(5);
        int var4 = field2137.get(2);
        int var5 = field2137.get(1);
        int var6 = field2137.get(11);
        int var7 = field2137.get(12);
        int var8 = field2137.get(13);
        return field2136[var2 - 1] + ", " + var3 / 10 + var3 % 10 + "-" + field2135[0][var4] + "-" + var5 + " " + var6 / 10 + var6 % 10 + ":" + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + " GMT";
    }
}
