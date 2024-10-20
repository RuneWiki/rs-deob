package deob;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

@ObfuscatedName("fk")
public class class163 {

    @ObfuscatedName("fk.x")
    public static final String[][] field2154 = new String[][] { { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" } };

    @ObfuscatedName("fk.n")
    public static final String[] field2148 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @ObfuscatedName("fk.g")
    public static Calendar field2149;

    static {
        Calendar.getInstance(TimeZone.getTimeZone("Europe/London"));
        field2149 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }

    public class163() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cv.x(J)Ljava/lang/String;")
    public static String method1918(long arg0) {
        field2149.setTime(new Date(arg0));
        int var2 = field2149.get(7);
        int var3 = field2149.get(5);
        int var4 = field2149.get(2);
        int var5 = field2149.get(1);
        int var6 = field2149.get(11);
        int var7 = field2149.get(12);
        int var8 = field2149.get(13);
        return field2148[var2 - 1] + ", " + var3 / 10 + var3 % 10 + "-" + field2154[0][var4] + "-" + var5 + " " + var6 / 10 + var6 % 10 + ":" + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + " GMT";
    }
}
