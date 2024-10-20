package deob;

import java.util.Comparator;

@ObfuscatedName("ho")
public final class class216 implements Comparator {

    @ObfuscatedName("ho.n(Lhe;Lhe;I)I")
    public int method3687(class214 arg0, class214 arg1) {
        return arg0.field3149.field3164 < arg1.field3149.field3164 ? -1 : (arg0.field3149.field3164 == arg1.field3149.field3164 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3687((class214) arg0, (class214) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
