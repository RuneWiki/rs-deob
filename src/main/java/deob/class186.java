package deob;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

@ObfuscatedName("gm")
public class class186 {

    @ObfuscatedName("gm.w")
    public static final String[][] field2462 = new String[][] { { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" } };

    @ObfuscatedName("gm.o")
    public static final String[] field2463 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @ObfuscatedName("gm.x")
    public static Calendar field2464;

    static {
        Calendar.getInstance(TimeZone.getTimeZone("Europe/London"));
        field2464 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }

    public class186() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bf.w(J)Ljava/lang/String;")
    public static String method974(long arg0) {
        field2464.setTime(new Date(arg0));
        int var2 = field2464.get(7);
        int var3 = field2464.get(5);
        int var4 = field2464.get(2);
        int var5 = field2464.get(1);
        int var6 = field2464.get(11);
        int var7 = field2464.get(12);
        int var8 = field2464.get(13);
        return field2463[var2 - 1] + ", " + var3 / 10 + var3 % 10 + "-" + field2462[0][var4] + "-" + var5 + " " + var6 / 10 + var6 % 10 + ":" + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + " GMT";
    }
}
