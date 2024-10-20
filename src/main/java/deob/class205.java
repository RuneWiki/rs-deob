package deob;

import java.util.Calendar;
import java.util.TimeZone;

@ObfuscatedName("gl")
public class class205 {

    @ObfuscatedName("gl.c")
    public static final String[][] field2609 = new String[][] { { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" } };

    @ObfuscatedName("gl.i")
    public static final String[] field2608 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @ObfuscatedName("gl.o")
    public static Calendar field2610;

    static {
        Calendar.getInstance(TimeZone.getTimeZone("Europe/London"));
        field2610 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }

    public class205() throws Throwable {
        throw new Error();
    }
}
