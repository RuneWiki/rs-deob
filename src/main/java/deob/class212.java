package deob;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

@ObfuscatedName("hg")
public class class212 {

    @ObfuscatedName("hg.m")
    public static final String[][] field2491 = new String[][] { { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" } };

    @ObfuscatedName("hg.f")
    public static final String[] field2489 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @ObfuscatedName("hg.q")
    public static Calendar field2490;

    static {
        Calendar.getInstance(TimeZone.getTimeZone("Europe/London"));
        field2490 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }

    public class212() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("h.m(J)Ljava/lang/String;")
    public static String method232(long arg0) {
        field2490.setTime(new Date(arg0));
        int var2 = field2490.get(7);
        int var3 = field2490.get(5);
        int var4 = field2490.get(2);
        int var5 = field2490.get(1);
        int var6 = field2490.get(11);
        int var7 = field2490.get(12);
        int var8 = field2490.get(13);
        return field2489[var2 - 1] + ", " + var3 / 10 + var3 % 10 + "-" + field2491[0][var4] + "-" + var5 + " " + var6 / 10 + var6 % 10 + ":" + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + " GMT";
    }
}
