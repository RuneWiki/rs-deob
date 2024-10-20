package deob;

import java.util.Comparator;

@ObfuscatedName("ho")
public final class class217 implements Comparator {

    @ObfuscatedName("ho.h(Lhh;Lhh;I)I")
    public int method3674(class214 arg0, class214 arg1) {
        return arg0.field3132.field3148 < arg1.field3132.field3148 ? -1 : (arg0.field3132.field3148 == arg1.field3132.field3148 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3674((class214) arg0, (class214) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
