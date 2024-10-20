package deob;

import java.util.Calendar;
import java.util.TimeZone;

@ObfuscatedName("fd")
public class class163 {

    @ObfuscatedName("fd.q")
    public static final String[][] field2153 = new String[][] { { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" } };

    @ObfuscatedName("fd.d")
    public static final String[] field2152 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @ObfuscatedName("fd.h")
    public static Calendar field2151;

    static {
        Calendar.getInstance(TimeZone.getTimeZone("Europe/London"));
        field2151 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }

    public class163() throws Throwable {
        throw new Error();
    }
}
