package deob;

import java.util.Calendar;
import java.util.TimeZone;

@ObfuscatedName("ga")
public class class194 {

    @ObfuscatedName("ga.p")
    public static final String[][] field2535 = new String[][] { { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" } };

    @ObfuscatedName("ga.i")
    public static final String[] field2534 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @ObfuscatedName("ga.w")
    public static Calendar field2533;

    static {
        Calendar.getInstance(TimeZone.getTimeZone("Europe/London"));
        field2533 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }

    public class194() throws Throwable {
        throw new Error();
    }
}
