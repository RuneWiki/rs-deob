package deob;

import java.util.Calendar;
import java.util.TimeZone;

@ObfuscatedName("gi")
public class class195 {

    @ObfuscatedName("gi.v")
    public static final String[][] field2434 = new String[][] { { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" } };

    @ObfuscatedName("gi.s")
    public static final String[] field2432 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @ObfuscatedName("gi.o")
    public static Calendar field2431;

    static {
        Calendar.getInstance(TimeZone.getTimeZone("Europe/London"));
        field2431 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }

    public class195() throws Throwable {
        throw new Error();
    }
}
