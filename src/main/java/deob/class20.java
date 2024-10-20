package deob;

import java.util.Comparator;

@ObfuscatedName("x")
public final class class20 implements Comparator {

    @ObfuscatedName("x.n(Lt;Lt;I)I")
    public int method133(class15 arg0, class15 arg1) {
        return arg0.field275 < arg1.field275 ? -1 : (arg0.field275 == arg1.field275 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method133((class15) arg0, (class15) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
