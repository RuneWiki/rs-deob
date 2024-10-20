package deob;

import java.util.Calendar;
import java.util.TimeZone;

@ObfuscatedName("go")
public class class190 {

    @ObfuscatedName("go.d")
    public static final String[][] field2539 = new String[][] { { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" } };

    @ObfuscatedName("go.x")
    public static final String[] field2540 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @ObfuscatedName("go.k")
    public static Calendar field2538;

    static {
        Calendar.getInstance(TimeZone.getTimeZone("Europe/London"));
        field2538 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }

    public class190() throws Throwable {
        throw new Error();
    }
}
