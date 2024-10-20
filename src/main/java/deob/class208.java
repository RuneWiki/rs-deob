package deob;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

@ObfuscatedName("gf")
public class class208 {

    @ObfuscatedName("gf.u")
    public static final String[][] field2510 = new String[][] { { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" }, { "jan", "fév", "mars", "avr", "mai", "juin", "juil", "août", "sept", "oct", "nov", "déc" }, { "jan", "fev", "mar", "abr", "mai", "jun", "jul", "ago", "set", "out", "nov", "dez" }, { "jan", "feb", "mrt", "apr", "mei", "jun", "jul", "aug", "sep", "okt", "nov", "dec" }, { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "ene", "feb", "mar", "abr", "may", "jun", "jul", "ago", "sep", "oct", "nov", "dic" } };

    @ObfuscatedName("gf.f")
    public static final String[] field2508 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @ObfuscatedName("gf.b")
    public static Calendar field2509;

    static {
        Calendar.getInstance();
        field2509 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }

    public class208() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("hc.u(J)Ljava/lang/String;")
    public static String method3731(long arg0) {
        field2509.setTime(new Date(arg0));
        int var2 = field2509.get(7);
        int var3 = field2509.get(5);
        int var4 = field2509.get(2);
        int var5 = field2509.get(1);
        int var6 = field2509.get(11);
        int var7 = field2509.get(12);
        int var8 = field2509.get(13);
        return field2508[var2 - 1] + ", " + var3 / 10 + var3 % 10 + "-" + field2510[0][var4] + "-" + var5 + " " + var6 / 10 + var6 % 10 + ":" + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + " GMT";
    }
}
