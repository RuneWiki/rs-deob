package deob;

import java.util.Calendar;
import java.util.TimeZone;

@ObfuscatedName("gg")
public class class205 {

    @ObfuscatedName("gg.o")
    public static final String[][] field2622 = new String[][] { { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" } };

    @ObfuscatedName("gg.k")
    public static final String[] field2620 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @ObfuscatedName("gg.t")
    public static Calendar field2621;

    static {
        Calendar.getInstance(TimeZone.getTimeZone("Europe/London"));
        field2621 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }

    public class205() throws Throwable {
        throw new Error();
    }
}
