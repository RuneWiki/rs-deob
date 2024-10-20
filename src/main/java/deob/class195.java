package deob;

import java.util.Calendar;
import java.util.TimeZone;

@ObfuscatedName("gh")
public class class195 {

    @ObfuscatedName("gh.g")
    public static final String[][] field2465 = new String[][] { { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" } };

    @ObfuscatedName("gh.r")
    public static final String[] field2467 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @ObfuscatedName("gh.e")
    public static Calendar field2464;

    static {
        Calendar.getInstance(TimeZone.getTimeZone("Europe/London"));
        field2464 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }

    public class195() throws Throwable {
        throw new Error();
    }
}
