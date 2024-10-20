package deob;

import java.util.Calendar;
import java.util.TimeZone;

@ObfuscatedName("fl")
public class class163 {

    @ObfuscatedName("fl.s")
    public static final String[][] field2161 = new String[][] { { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" } };

    @ObfuscatedName("fl.c")
    public static final String[] field2160 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @ObfuscatedName("fl.f")
    public static Calendar field2159;

    static {
        Calendar.getInstance(TimeZone.getTimeZone("Europe/London"));
        field2159 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }

    public class163() throws Throwable {
        throw new Error();
    }
}
