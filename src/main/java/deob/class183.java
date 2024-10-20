package deob;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

@ObfuscatedName("gd")
public class class183 {

    @ObfuscatedName("gd.c")
    public static final String[][] field2410 = new String[][] { { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" } };

    @ObfuscatedName("gd.o")
    public static final String[] field2409 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @ObfuscatedName("gd.i")
    public static Calendar field2411;

    static {
        Calendar.getInstance(TimeZone.getTimeZone("Europe/London"));
        field2411 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }

    public class183() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dy.c(J)Ljava/lang/String;")
    public static String method1888(long arg0) {
        field2411.setTime(new Date(arg0));
        int var2 = field2411.get(7);
        int var3 = field2411.get(5);
        int var4 = field2411.get(2);
        int var5 = field2411.get(1);
        int var6 = field2411.get(11);
        int var7 = field2411.get(12);
        int var8 = field2411.get(13);
        return field2409[var2 - 1] + ", " + var3 / 10 + var3 % 10 + "-" + field2410[0][var4] + "-" + var5 + " " + var6 / 10 + var6 % 10 + ":" + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + " GMT";
    }
}
