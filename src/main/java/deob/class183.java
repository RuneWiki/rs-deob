package deob;

import java.util.Calendar;
import java.util.TimeZone;

@ObfuscatedName("ga")
public class class183 {

    @ObfuscatedName("ga.d")
    public static final String[][] field2415 = new String[][] { { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" } };

    @ObfuscatedName("ga.q")
    public static final String[] field2410 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @ObfuscatedName("ga.x")
    public static Calendar field2411;

    static {
        Calendar.getInstance(TimeZone.getTimeZone("Europe/London"));
        field2411 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }

    public class183() throws Throwable {
        throw new Error();
    }
}
