package deob;

import java.util.Comparator;

@ObfuscatedName("u")
public final class class18 implements Comparator {

    @ObfuscatedName("u.s(Lq;Lq;I)I")
    public int method118(class15 arg0, class15 arg1) {
        return arg0.field280.field301 < arg1.field280.field301 ? -1 : (arg0.field280.field301 == arg1.field280.field301 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method118((class15) arg0, (class15) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
