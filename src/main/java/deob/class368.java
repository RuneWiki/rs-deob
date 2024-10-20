package deob;

import java.util.Calendar;
import java.util.TimeZone;

@ObfuscatedName("os")
public class class368 {

    @ObfuscatedName("os.ac")
    public static final String[][] field4023 = new String[][] { { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" }, { "jan", "fév", "mars", "avr", "mai", "juin", "juil", "août", "sept", "oct", "nov", "déc" }, { "jan", "fev", "mar", "abr", "mai", "jun", "jul", "ago", "set", "out", "nov", "dez" }, { "jan", "feb", "mrt", "apr", "mei", "jun", "jul", "aug", "sep", "okt", "nov", "dec" }, { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "ene", "feb", "mar", "abr", "may", "jun", "jul", "ago", "sep", "oct", "nov", "dic" } };

    @ObfuscatedName("os.ae")
    public static final String[] field4024 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @ObfuscatedName("os.ag")
    public static Calendar field4022;

    static {
        Calendar.getInstance();
        field4022 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }

    public class368() throws Throwable {
        throw new Error();
    }
}
