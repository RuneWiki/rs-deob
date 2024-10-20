package deob;

import java.util.Calendar;
import java.util.TimeZone;

@ObfuscatedName("fs")
public class class163 {

    @ObfuscatedName("fs.p")
    public static final String[][] field2146 = new String[][] { { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" } };

    @ObfuscatedName("fs.g")
    public static final String[] field2149 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @ObfuscatedName("fs.x")
    public static Calendar field2147;

    static {
        Calendar.getInstance(TimeZone.getTimeZone("Europe/London"));
        field2147 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }

    public class163() throws Throwable {
        throw new Error();
    }
}
