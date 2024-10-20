package deob;

import java.util.Calendar;
import java.util.TimeZone;

@ObfuscatedName("gr")
public class class193 {

    @ObfuscatedName("gr.z")
    public static final String[][] field2393 = new String[][] { { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" } };

    @ObfuscatedName("gr.w")
    public static final String[] field2391 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @ObfuscatedName("gr.s")
    public static Calendar field2390;

    static {
        Calendar.getInstance(TimeZone.getTimeZone("Europe/London"));
        field2390 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }

    public class193() throws Throwable {
        throw new Error();
    }
}
