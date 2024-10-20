package deob;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

@ObfuscatedName("gt")
public class class205 {

    @ObfuscatedName("gt.d")
    public static final String[][] field2623 = new String[][] { { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" } };

    @ObfuscatedName("gt.z")
    public static final String[] field2621 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @ObfuscatedName("gt.n")
    public static Calendar field2622;

    static {
        Calendar.getInstance(TimeZone.getTimeZone("Europe/London"));
        field2622 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }

    public class205() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("kr.d(J)Ljava/lang/String;")
    public static String method5144(long arg0) {
        field2622.setTime(new Date(arg0));
        int var2 = field2622.get(7);
        int var3 = field2622.get(5);
        int var4 = field2622.get(2);
        int var5 = field2622.get(1);
        int var6 = field2622.get(11);
        int var7 = field2622.get(12);
        int var8 = field2622.get(13);
        return field2621[var2 - 1] + ", " + var3 / 10 + var3 % 10 + "-" + field2623[0][var4] + "-" + var5 + " " + var6 / 10 + var6 % 10 + ":" + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + " GMT";
    }
}
