package deob;

import java.util.Comparator;

@ObfuscatedName("hf")
public final class class217 implements Comparator {

    @ObfuscatedName("hf.n(Lhe;Lhe;I)I")
    public int method3697(class214 arg0, class214 arg1) {
        return arg0.field3149.field3161 < arg1.field3149.field3161 ? -1 : (arg0.field3149.field3161 == arg1.field3149.field3161 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3697((class214) arg0, (class214) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
