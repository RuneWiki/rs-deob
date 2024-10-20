package deob;

import java.util.Calendar;
import java.util.TimeZone;

@ObfuscatedName("gp")
public class class193 {

    @ObfuscatedName("gp.w")
    public static final String[][] field2418 = new String[][] { { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" } };

    @ObfuscatedName("gp.m")
    public static final String[] field2415 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @ObfuscatedName("gp.q")
    public static Calendar field2419;

    static {
        Calendar.getInstance(TimeZone.getTimeZone("Europe/London"));
        field2419 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }

    public class193() throws Throwable {
        throw new Error();
    }
}
