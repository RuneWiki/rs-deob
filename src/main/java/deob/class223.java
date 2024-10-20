package deob;

import java.util.Comparator;

@ObfuscatedName("ha")
public final class class223 implements Comparator {

    @ObfuscatedName("ha.k(Lhp;Lhp;B)I")
    public int method3761(class218 arg0, class218 arg1) {
        return arg0.field3198 < arg1.field3198 ? -1 : (arg0.field3198 == arg1.field3198 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3761((class218) arg0, (class218) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
