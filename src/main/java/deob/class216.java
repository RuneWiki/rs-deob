package deob;

import java.util.Comparator;

@ObfuscatedName("he")
public final class class216 implements Comparator {

    @ObfuscatedName("he.g(Lhv;Lhv;I)I")
    public int method3734(class214 arg0, class214 arg1) {
        return arg0.field3130.field3151 < arg1.field3130.field3151 ? -1 : (arg0.field3130.field3151 == arg1.field3130.field3151 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3734((class214) arg0, (class214) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
