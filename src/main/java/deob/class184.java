package deob;

import java.util.Calendar;
import java.util.TimeZone;

@ObfuscatedName("gc")
public class class184 {

    @ObfuscatedName("gc.i")
    public static final String[][] field2446 = new String[][] { { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" } };

    @ObfuscatedName("gc.j")
    public static final String[] field2447 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @ObfuscatedName("gc.a")
    public static Calendar field2449;

    static {
        Calendar.getInstance(TimeZone.getTimeZone("Europe/London"));
        field2449 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }

    public class184() throws Throwable {
        throw new Error();
    }
}
