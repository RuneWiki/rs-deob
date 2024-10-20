package deob;

import java.util.Comparator;

@ObfuscatedName("hz")
public final class class223 implements Comparator {

    @ObfuscatedName("hz.s(Lhk;Lhk;B)I")
    public int method3754(class218 arg0, class218 arg1) {
        return arg0.field3200 < arg1.field3200 ? -1 : (arg0.field3200 == arg1.field3200 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3754((class218) arg0, (class218) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
