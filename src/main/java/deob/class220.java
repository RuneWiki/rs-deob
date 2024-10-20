package deob;

import java.util.Comparator;

@ObfuscatedName("hx")
public final class class220 implements Comparator {

    @ObfuscatedName("hx.k(Lhp;Lhp;B)I")
    public int method3739(class218 arg0, class218 arg1) {
        return arg0.field3199.field3222 < arg1.field3199.field3222 ? -1 : (arg0.field3199.field3222 == arg1.field3199.field3222 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3739((class218) arg0, (class218) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
