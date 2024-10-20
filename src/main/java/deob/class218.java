package deob;

import java.util.Comparator;

@ObfuscatedName("hz")
public final class class218 implements Comparator {

    @ObfuscatedName("hz.e(Lhx;Lhx;I)I")
    public int method3673(class215 arg0, class215 arg1) {
        return arg0.field3147.field3168 < arg1.field3147.field3168 ? -1 : (arg0.field3147.field3168 == arg1.field3147.field3168 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3673((class215) arg0, (class215) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
