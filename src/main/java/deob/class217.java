package deob;

import java.util.Comparator;

@ObfuscatedName("ho")
public final class class217 implements Comparator {

    @ObfuscatedName("ho.f(Lhq;Lhq;I)I")
    public int method3709(class214 arg0, class214 arg1) {
        return arg0.field3137.field3157 < arg1.field3137.field3157 ? -1 : (arg0.field3137.field3157 == arg1.field3137.field3157 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3709((class214) arg0, (class214) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
