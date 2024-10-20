package deob;

import java.util.Calendar;
import java.util.TimeZone;

@ObfuscatedName("gj")
public class class183 {

    @ObfuscatedName("gj.d")
    public static final String[][] field2461 = new String[][] { { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" } };

    @ObfuscatedName("gj.k")
    public static final String[] field2459 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @ObfuscatedName("gj.e")
    public static Calendar field2460;

    static {
        Calendar.getInstance(TimeZone.getTimeZone("Europe/London"));
        field2460 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }

    public class183() throws Throwable {
        throw new Error();
    }
}
