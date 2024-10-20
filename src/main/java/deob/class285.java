package deob;

import java.util.Calendar;
import java.util.TimeZone;

@ObfuscatedName("jz")
public class class285 {

    @ObfuscatedName("jz.o")
    public static final String[][] field3336 = new String[][] { { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" }, { "jan", "fév", "mars", "avr", "mai", "juin", "juil", "août", "sept", "oct", "nov", "déc" }, { "jan", "fev", "mar", "abr", "mai", "jun", "jul", "ago", "set", "out", "nov", "dez" }, { "jan", "feb", "mrt", "apr", "mei", "jun", "jul", "aug", "sep", "okt", "nov", "dec" }, { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "ene", "feb", "mar", "abr", "may", "jun", "jul", "ago", "sep", "oct", "nov", "dic" } };

    @ObfuscatedName("jz.q")
    public static final String[] field3335 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @ObfuscatedName("jz.l")
    public static Calendar field3334;

    static {
        Calendar.getInstance();
        field3334 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }

    public class285() throws Throwable {
        throw new Error();
    }
}
