package deob;

import java.util.Comparator;

@ObfuscatedName("hx")
public final class class218 implements Comparator {

    @ObfuscatedName("hx.m(Lhv;Lhv;I)I")
    public int method3766(class214 arg0, class214 arg1) {
        return arg0.field3121 < arg1.field3121 ? -1 : (arg0.field3121 == arg1.field3121 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3766((class214) arg0, (class214) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
