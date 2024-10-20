package deob;

import java.util.Calendar;
import java.util.TimeZone;

@ObfuscatedName("fx")
public class class170 {

    @ObfuscatedName("fx.n")
    public static final String[][] field2346 = new String[][] { { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" } };

    @ObfuscatedName("fx.d")
    public static final String[] field2345 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @ObfuscatedName("fx.m")
    public static Calendar field2344;

    static {
        Calendar.getInstance(TimeZone.getTimeZone("Europe/London"));
        field2344 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }

    public class170() throws Throwable {
        throw new Error();
    }
}
