package deob;

import java.util.Comparator;

@ObfuscatedName("qn")
public class class446 implements Comparator {

    @ObfuscatedName("qn.o")
    public final boolean field4741;

    public class446(boolean arg0) {
        this.field4741 = arg0;
    }

    @ObfuscatedName("qn.o(Lnb;Lnb;I)I")
    public int method7181(class372 arg0, class372 arg1) {
        return this.field4741 ? arg0.method6011().method7497(arg1.method6011()) : arg1.method6011().method7497(arg0.method6011());
    }

    public int compare(Object arg0, Object arg1) {
        return this.method7181((class372) arg0, (class372) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
