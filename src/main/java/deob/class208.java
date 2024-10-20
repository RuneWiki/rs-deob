package deob;

import java.util.Comparator;

@ObfuscatedName("gy")
public final class class208 implements Comparator {

    @ObfuscatedName("gy.y(Lgv;Lgv;I)I")
    public int method3549(class205 arg0, class205 arg1) {
        return arg0.field3054.field3076 < arg1.field3054.field3076 ? -1 : (arg0.field3054.field3076 == arg1.field3054.field3076 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3549((class205) arg0, (class205) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
