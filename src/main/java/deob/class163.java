package deob;

import java.util.Calendar;
import java.util.TimeZone;

@ObfuscatedName("fr")
public class class163 {

    @ObfuscatedName("fr.b")
    public static final String[][] field2145 = new String[][] { { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" } };

    @ObfuscatedName("fr.e")
    public static final String[] field2138 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @ObfuscatedName("fr.c")
    public static Calendar field2139;

    static {
        Calendar.getInstance(TimeZone.getTimeZone("Europe/London"));
        field2139 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }

    public class163() throws Throwable {
        throw new Error();
    }
}
