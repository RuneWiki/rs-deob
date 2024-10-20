package deob;

import java.util.Calendar;
import java.util.TimeZone;

@ObfuscatedName("gx")
public class class205 {

    @ObfuscatedName("gx.t")
    public static final String[][] field2606 = new String[][] { { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" } };

    @ObfuscatedName("gx.q")
    public static final String[] field2603 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @ObfuscatedName("gx.i")
    public static Calendar field2607;

    static {
        Calendar.getInstance(TimeZone.getTimeZone("Europe/London"));
        field2607 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }

    public class205() throws Throwable {
        throw new Error();
    }
}
