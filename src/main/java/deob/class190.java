package deob;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

@ObfuscatedName("gv")
public class class190 {

    @ObfuscatedName("gv.m")
    public static final String[][] field2537 = new String[][] { { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" } };

    @ObfuscatedName("gv.p")
    public static final String[] field2535 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @ObfuscatedName("gv.i")
    public static Calendar field2536;

    static {
        Calendar.getInstance(TimeZone.getTimeZone("Europe/London"));
        field2536 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }

    public class190() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("aa.m(J)Ljava/lang/String;")
    public static String method678(long arg0) {
        field2536.setTime(new Date(arg0));
        int var2 = field2536.get(7);
        int var3 = field2536.get(5);
        int var4 = field2536.get(2);
        int var5 = field2536.get(1);
        int var6 = field2536.get(11);
        int var7 = field2536.get(12);
        int var8 = field2536.get(13);
        return field2535[var2 - 1] + ", " + var3 / 10 + var3 % 10 + "-" + field2537[0][var4] + "-" + var5 + " " + var6 / 10 + var6 % 10 + ":" + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + " GMT";
    }
}
