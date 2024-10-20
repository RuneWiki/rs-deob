package deob;

import java.util.Calendar;
import java.util.TimeZone;

@ObfuscatedName("gl")
public class class183 {

    @ObfuscatedName("gl.i")
    public static final String[][] field2453 = new String[][] { { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" } };

    @ObfuscatedName("gl.c")
    public static final String[] field2452 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @ObfuscatedName("gl.e")
    public static Calendar field2456;

    static {
        Calendar.getInstance(TimeZone.getTimeZone("Europe/London"));
        field2456 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }

    public class183() throws Throwable {
        throw new Error();
    }
}
