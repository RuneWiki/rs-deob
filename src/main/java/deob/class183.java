package deob;

import java.util.Calendar;
import java.util.TimeZone;

@ObfuscatedName("gh")
public class class183 {

    @ObfuscatedName("gh.a")
    public static final String[][] field2441 = new String[][] { { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" } };

    @ObfuscatedName("gh.j")
    public static final String[] field2437 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @ObfuscatedName("gh.n")
    public static Calendar field2439;

    static {
        Calendar.getInstance(TimeZone.getTimeZone("Europe/London"));
        field2439 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }

    public class183() throws Throwable {
        throw new Error();
    }
}
