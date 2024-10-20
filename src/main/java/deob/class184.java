package deob;

import java.util.Calendar;
import java.util.TimeZone;

@ObfuscatedName("gg")
public class class184 {

    @ObfuscatedName("gg.e")
    public static final String[][] field2427 = new String[][] { { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" } };

    @ObfuscatedName("gg.n")
    public static final String[] field2423 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @ObfuscatedName("gg.g")
    public static Calendar field2425;

    static {
        Calendar.getInstance(TimeZone.getTimeZone("Europe/London"));
        field2425 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }

    public class184() throws Throwable {
        throw new Error();
    }
}
