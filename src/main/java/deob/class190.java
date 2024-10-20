package deob;

import java.util.Calendar;
import java.util.TimeZone;

@ObfuscatedName("ga")
public class class190 {

    @ObfuscatedName("ga.b")
    public static final String[][] field2529 = new String[][] { { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" } };

    @ObfuscatedName("ga.s")
    public static final String[] field2527 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @ObfuscatedName("ga.r")
    public static Calendar field2531;

    static {
        Calendar.getInstance(TimeZone.getTimeZone("Europe/London"));
        field2531 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }

    public class190() throws Throwable {
        throw new Error();
    }
}
