package deob;

import java.util.Comparator;

@ObfuscatedName("l")
public final class class18 implements Comparator {

    @ObfuscatedName("l.p(Ln;Ln;I)I")
    public int method123(class15 arg0, class15 arg1) {
        return arg0.field275.field288 < arg1.field275.field288 ? -1 : (arg0.field275.field288 == arg1.field275.field288 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method123((class15) arg0, (class15) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
