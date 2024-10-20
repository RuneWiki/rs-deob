package deob;

import java.util.Comparator;

@ObfuscatedName("hy")
public final class class209 implements Comparator {

    @ObfuscatedName("hy.n(Lgk;Lgk;I)I")
    public int method3595(class205 arg0, class205 arg1) {
        return arg0.field3055 < arg1.field3055 ? -1 : (arg0.field3055 == arg1.field3055 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3595((class205) arg0, (class205) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
