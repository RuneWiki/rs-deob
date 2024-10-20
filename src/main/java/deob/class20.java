package deob;

import java.util.Comparator;

@ObfuscatedName("y")
public final class class20 implements Comparator {

    @ObfuscatedName("y.w(La;La;I)I")
    public int method132(class15 arg0, class15 arg1) {
        return arg0.field294 < arg1.field294 ? -1 : (arg0.field294 == arg1.field294 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method132((class15) arg0, (class15) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
