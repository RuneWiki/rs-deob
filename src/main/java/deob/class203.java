package deob;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

@ObfuscatedName("gp")
public class class203 {

    @ObfuscatedName("gp.b")
    public static final String[][] field2584 = new String[][] { { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" } };

    @ObfuscatedName("gp.q")
    public static final String[] field2586 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @ObfuscatedName("gp.o")
    public static Calendar field2585;

    static {
        Calendar.getInstance(TimeZone.getTimeZone("Europe/London"));
        field2585 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }

    public class203() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fb.b(J)Ljava/lang/String;")
    public static String method3011(long arg0) {
        field2585.setTime(new Date(arg0));
        int var2 = field2585.get(7);
        int var3 = field2585.get(5);
        int var4 = field2585.get(2);
        int var5 = field2585.get(1);
        int var6 = field2585.get(11);
        int var7 = field2585.get(12);
        int var8 = field2585.get(13);
        return field2586[var2 - 1] + ", " + var3 / 10 + var3 % 10 + "-" + field2584[0][var4] + "-" + var5 + " " + var6 / 10 + var6 % 10 + ":" + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + " GMT";
    }
}
