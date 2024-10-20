package deob;

import java.util.Calendar;
import java.util.TimeZone;

@ObfuscatedName("gt")
public class class205 {

    @ObfuscatedName("gt.g")
    public static final String[][] field2629 = new String[][] { { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" } };

    @ObfuscatedName("gt.e")
    public static final String[] field2624 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @ObfuscatedName("gt.b")
    public static Calendar field2625;

    static {
        Calendar.getInstance(TimeZone.getTimeZone("Europe/London"));
        field2625 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }

    public class205() throws Throwable {
        throw new Error();
    }
}
