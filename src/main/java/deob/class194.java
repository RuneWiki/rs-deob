package deob;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

@ObfuscatedName("gw")
public class class194 {

    @ObfuscatedName("gw.a")
    public static final String[][] field2564 = new String[][] { { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" } };

    @ObfuscatedName("gw.w")
    public static final String[] field2562 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @ObfuscatedName("gw.e")
    public static Calendar field2563;

    static {
        Calendar.getInstance(TimeZone.getTimeZone("Europe/London"));
        field2563 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }

    public class194() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("client.a(J)Ljava/lang/String;")
    public static String method1335(long arg0) {
        field2563.setTime(new Date(arg0));
        int var2 = field2563.get(7);
        int var3 = field2563.get(5);
        int var4 = field2563.get(2);
        int var5 = field2563.get(1);
        int var6 = field2563.get(11);
        int var7 = field2563.get(12);
        int var8 = field2563.get(13);
        return field2562[var2 - 1] + ", " + var3 / 10 + var3 % 10 + "-" + field2564[0][var4] + "-" + var5 + " " + var6 / 10 + var6 % 10 + ":" + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + " GMT";
    }
}
