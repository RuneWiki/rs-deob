package deob;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

@ObfuscatedName("fv")
public class class163 {

    @ObfuscatedName("fv.u")
    public static final String[][] field2131 = new String[][] { { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" } };

    @ObfuscatedName("fv.x")
    public static final String[] field2132 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @ObfuscatedName("fv.i")
    public static Calendar field2133;

    static {
        Calendar.getInstance(TimeZone.getTimeZone("Europe/London"));
        field2133 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }

    public class163() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fq.u(J)Ljava/lang/String;")
    public static String method2965(long arg0) {
        field2133.setTime(new Date(arg0));
        int var2 = field2133.get(7);
        int var3 = field2133.get(5);
        int var4 = field2133.get(2);
        int var5 = field2133.get(1);
        int var6 = field2133.get(11);
        int var7 = field2133.get(12);
        int var8 = field2133.get(13);
        return field2132[var2 - 1] + ", " + var3 / 10 + var3 % 10 + "-" + field2131[0][var4] + "-" + var5 + " " + var6 / 10 + var6 % 10 + ":" + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + " GMT";
    }
}
