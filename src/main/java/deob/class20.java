package deob;

import java.util.Comparator;

@ObfuscatedName("p")
public final class class20 implements Comparator {

    @ObfuscatedName("p.s(Lq;Lq;I)I")
    public int method139(class15 arg0, class15 arg1) {
        return arg0.field278 < arg1.field278 ? -1 : (arg0.field278 == arg1.field278 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method139((class15) arg0, (class15) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
