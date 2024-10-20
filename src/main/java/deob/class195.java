package deob;

import java.util.Calendar;
import java.util.TimeZone;

@ObfuscatedName("gg")
public class class195 {

    @ObfuscatedName("gg.f")
    public static final String[][] field2456 = new String[][] { { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" } };

    @ObfuscatedName("gg.h")
    public static final String[] field2451 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @ObfuscatedName("gg.e")
    public static Calendar field2452;

    static {
        Calendar.getInstance(TimeZone.getTimeZone("Europe/London"));
        field2452 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }

    public class195() throws Throwable {
        throw new Error();
    }
}
