package deob;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

@ObfuscatedName("gq")
public class class194 {

    @ObfuscatedName("gq.n")
    public static final String[][] field2569 = new String[][] { { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" } };

    @ObfuscatedName("gq.v")
    public static final String[] field2570 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @ObfuscatedName("gq.y")
    public static Calendar field2568;

    static {
        Calendar.getInstance(TimeZone.getTimeZone("Europe/London"));
        field2568 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }

    public class194() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bn.n(J)Ljava/lang/String;")
    public static String method1015(long arg0) {
        field2568.setTime(new Date(arg0));
        int var2 = field2568.get(7);
        int var3 = field2568.get(5);
        int var4 = field2568.get(2);
        int var5 = field2568.get(1);
        int var6 = field2568.get(11);
        int var7 = field2568.get(12);
        int var8 = field2568.get(13);
        return field2570[var2 - 1] + ", " + var3 / 10 + var3 % 10 + "-" + field2569[0][var4] + "-" + var5 + " " + var6 / 10 + var6 % 10 + ":" + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + " GMT";
    }
}
