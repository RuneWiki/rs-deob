package deob;

import java.util.Comparator;

@ObfuscatedName("k")
public final class class18 implements Comparator {

    @ObfuscatedName("k.p(Lg;Lg;B)I")
    public int method128(class15 arg0, class15 arg1) {
        return arg0.field293.field308 < arg1.field293.field308 ? -1 : (arg0.field293.field308 == arg1.field293.field308 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method128((class15) arg0, (class15) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
