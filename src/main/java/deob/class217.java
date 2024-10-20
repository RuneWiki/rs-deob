package deob;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

@ObfuscatedName("hk")
public class class217 {

    @ObfuscatedName("hk.z")
    public static final String[][] field2534 = new String[][] { { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" }, { "jan", "fév", "mars", "avr", "mai", "juin", "juil", "août", "sept", "oct", "nov", "déc" }, { "jan", "fev", "mar", "abr", "mai", "jun", "jul", "ago", "set", "out", "nov", "dez" }, { "jan", "feb", "mrt", "apr", "mei", "jun", "jul", "aug", "sep", "okt", "nov", "dec" }, { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "ene", "feb", "mar", "abr", "may", "jun", "jul", "ago", "sep", "oct", "nov", "dic" } };

    @ObfuscatedName("hk.k")
    public static final String[] field2535 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @ObfuscatedName("hk.s")
    public static Calendar field2533;

    static {
        Calendar.getInstance();
        field2533 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }

    public class217() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("as.z(J)Ljava/lang/String;")
    public static String method558(long arg0) {
        field2533.setTime(new Date(arg0));
        int var2 = field2533.get(7);
        int var3 = field2533.get(5);
        int var4 = field2533.get(2);
        int var5 = field2533.get(1);
        int var6 = field2533.get(11);
        int var7 = field2533.get(12);
        int var8 = field2533.get(13);
        return field2535[var2 - 1] + ", " + var3 / 10 + var3 % 10 + "-" + field2534[0][var4] + "-" + var5 + " " + var6 / 10 + var6 % 10 + ":" + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + " GMT";
    }
}
