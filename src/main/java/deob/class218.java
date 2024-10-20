package deob;

import java.util.Comparator;

@ObfuscatedName("hz")
public final class class218 implements Comparator {

    @ObfuscatedName("hz.c(Lhm;Lhm;B)I")
    public int method3697(class214 arg0, class214 arg1) {
        return arg0.field3124 < arg1.field3124 ? -1 : (arg0.field3124 == arg1.field3124 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3697((class214) arg0, (class214) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
