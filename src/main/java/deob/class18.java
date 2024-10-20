package deob;

import java.util.Comparator;

@ObfuscatedName("s")
public final class class18 implements Comparator {

    @ObfuscatedName("s.d(Ly;Ly;I)I")
    public int method128(class15 arg0, class15 arg1) {
        return arg0.field275.field293 < arg1.field275.field293 ? -1 : (arg0.field275.field293 == arg1.field275.field293 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method128((class15) arg0, (class15) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
