package deob;

import java.util.Comparator;

@ObfuscatedName("hj")
public final class class216 implements Comparator {

    @ObfuscatedName("hj.j(Lhp;Lhp;I)I")
    public int method3646(class214 arg0, class214 arg1) {
        return arg0.field3143.field3168 < arg1.field3143.field3168 ? -1 : (arg0.field3143.field3168 == arg1.field3143.field3168 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3646((class214) arg0, (class214) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
