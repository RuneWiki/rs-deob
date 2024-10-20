package deob;

import java.util.Comparator;

@ObfuscatedName("y")
public final class class16 implements Comparator {

    @ObfuscatedName("y.p(Ln;Ln;I)I")
    public int method92(class15 arg0, class15 arg1) {
        return arg0.field275.field292 < arg1.field275.field292 ? -1 : (arg0.field275.field292 == arg1.field275.field292 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method92((class15) arg0, (class15) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
