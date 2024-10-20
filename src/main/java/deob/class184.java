package deob;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

@ObfuscatedName("gf")
public class class184 {

    @ObfuscatedName("gf.j")
    public static final String[][] field2444 = new String[][] { { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" } };

    @ObfuscatedName("gf.h")
    public static final String[] field2443 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @ObfuscatedName("gf.f")
    public static Calendar field2442;

    static {
        Calendar.getInstance(TimeZone.getTimeZone("Europe/London"));
        field2442 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }

    public class184() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fr.j(J)Ljava/lang/String;")
    public static String method2743(long arg0) {
        field2442.setTime(new Date(arg0));
        int var2 = field2442.get(7);
        int var3 = field2442.get(5);
        int var4 = field2442.get(2);
        int var5 = field2442.get(1);
        int var6 = field2442.get(11);
        int var7 = field2442.get(12);
        int var8 = field2442.get(13);
        return field2443[var2 - 1] + ", " + var3 / 10 + var3 % 10 + "-" + field2444[0][var4] + "-" + var5 + " " + var6 / 10 + var6 % 10 + ":" + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + " GMT";
    }
}
