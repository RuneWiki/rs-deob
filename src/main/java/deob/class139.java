package deob;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

@ObfuscatedName("el")
public class class139 {

    @ObfuscatedName("el.d")
    public static final String[][] field2004 = new String[][] { { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" } };

    @ObfuscatedName("el.c")
    public static final String[] field2003 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @ObfuscatedName("el.n")
    public static Calendar field2005;

    static {
        Calendar.getInstance(TimeZone.getTimeZone("Europe/London"));
        field2005 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }

    public class139() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ds.d(J)Ljava/lang/String;")
    public static String method2097(long arg0) {
        field2005.setTime(new Date(arg0));
        int var2 = field2005.get(7);
        int var3 = field2005.get(5);
        int var4 = field2005.get(2);
        int var5 = field2005.get(1);
        int var6 = field2005.get(11);
        int var7 = field2005.get(12);
        int var8 = field2005.get(13);
        return field2003[var2 - 1] + ", " + var3 / 10 + var3 % 10 + "-" + field2004[0][var4] + "-" + var5 + " " + var6 / 10 + var6 % 10 + ":" + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + " GMT";
    }
}
