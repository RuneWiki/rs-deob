package deob;

import java.util.Calendar;
import java.util.TimeZone;

@ObfuscatedName("go")
public class class186 {

    @ObfuscatedName("go.s")
    public static final String[][] field2454 = new String[][] { { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" } };

    @ObfuscatedName("go.c")
    public static final String[] field2455 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @ObfuscatedName("go.f")
    public static Calendar field2456;

    static {
        Calendar.getInstance(TimeZone.getTimeZone("Europe/London"));
        field2456 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }

    public class186() throws Throwable {
        throw new Error();
    }
}
