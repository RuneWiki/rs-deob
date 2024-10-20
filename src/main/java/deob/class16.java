package deob;

import java.util.Comparator;

@ObfuscatedName("v")
public final class class16 implements Comparator {

    @ObfuscatedName("v.e(Lc;Lc;B)I")
    public int method63(class15 arg0, class15 arg1) {
        return arg0.field283.field301 < arg1.field283.field301 ? -1 : (arg0.field283.field301 == arg1.field283.field301 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method63((class15) arg0, (class15) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
