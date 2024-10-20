package deob;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

@ObfuscatedName("jf")
public class class284 {

    @ObfuscatedName("jf.c")
    public static final String[][] field3303 = new String[][] { { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" }, { "jan", "fév", "mars", "avr", "mai", "juin", "juil", "août", "sept", "oct", "nov", "déc" }, { "jan", "fev", "mar", "abr", "mai", "jun", "jul", "ago", "set", "out", "nov", "dez" }, { "jan", "feb", "mrt", "apr", "mei", "jun", "jul", "aug", "sep", "okt", "nov", "dec" }, { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "ene", "feb", "mar", "abr", "may", "jun", "jul", "ago", "sep", "oct", "nov", "dic" } };

    @ObfuscatedName("jf.v")
    public static final String[] field3301 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @ObfuscatedName("jf.q")
    public static Calendar field3302;

    static {
        Calendar.getInstance();
        field3302 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }

    public class284() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("co.c(J)Ljava/lang/String;")
    public static String method2267(long arg0) {
        field3302.setTime(new Date(arg0));
        int var2 = field3302.get(7);
        int var3 = field3302.get(5);
        int var4 = field3302.get(2);
        int var5 = field3302.get(1);
        int var6 = field3302.get(11);
        int var7 = field3302.get(12);
        int var8 = field3302.get(13);
        return field3301[var2 - 1] + ", " + var3 / 10 + var3 % 10 + "-" + field3303[0][var4] + "-" + var5 + " " + var6 / 10 + var6 % 10 + ":" + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + " GMT";
    }
}
