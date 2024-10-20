package deob;

import java.util.Comparator;

@ObfuscatedName("ho")
public final class class218 implements Comparator {

    @ObfuscatedName("ho.g(Lhv;Lhv;I)I")
    public int method3752(class214 arg0, class214 arg1) {
        return arg0.field3126 < arg1.field3126 ? -1 : (arg0.field3126 == arg1.field3126 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3752((class214) arg0, (class214) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
