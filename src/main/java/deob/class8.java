package deob;

import java.util.Comparator;

@ObfuscatedName("x")
public final class class8 implements Comparator {

    @ObfuscatedName("x.w(Lq;Lq;I)I")
    public int method80(class3 arg0, class3 arg1) {
        return arg0.field11 < arg1.field11 ? -1 : (arg0.field11 == arg1.field11 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method80((class3) arg0, (class3) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
