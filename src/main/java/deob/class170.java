package deob;

import java.util.Calendar;
import java.util.TimeZone;

@ObfuscatedName("fk")
public class class170 {

    @ObfuscatedName("fk.k")
    public static final String[][] field2319 = new String[][] { { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" } };

    @ObfuscatedName("fk.y")
    public static final String[] field2315 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @ObfuscatedName("fk.o")
    public static Calendar field2320;

    static {
        Calendar.getInstance(TimeZone.getTimeZone("Europe/London"));
        field2320 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }

    public class170() throws Throwable {
        throw new Error();
    }
}
