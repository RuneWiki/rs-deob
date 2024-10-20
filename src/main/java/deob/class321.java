package deob;

import java.util.Comparator;

@ObfuscatedName("lz")
public final class class321 implements Comparator {

    @ObfuscatedName("lz.s(Llh;Llh;I)I")
    public int method5318(class324 arg0, class324 arg1) {
        return arg0.field4067 < arg1.field4067 ? -1 : (arg0.field4067 == arg1.field4067 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method5318((class324) arg0, (class324) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
