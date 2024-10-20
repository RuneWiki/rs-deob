package deob;

import java.util.Calendar;
import java.util.TimeZone;

@ObfuscatedName("gb")
public class class183 {

    @ObfuscatedName("gb.e")
    public static final String[][] field2427 = new String[][] { { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" } };

    @ObfuscatedName("gb.o")
    public static final String[] field2424 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @ObfuscatedName("gb.m")
    public static Calendar field2425;

    static {
        Calendar.getInstance(TimeZone.getTimeZone("Europe/London"));
        field2425 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }

    public class183() throws Throwable {
        throw new Error();
    }
}
