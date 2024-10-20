package deob;

import java.util.Comparator;

@ObfuscatedName("gh")
public final class class208 implements Comparator {

    @ObfuscatedName("gh.n(Lgy;Lgy;B)I")
    public int method3595(class205 arg0, class205 arg1) {
        return arg0.field3051.field3073 < arg1.field3051.field3073 ? -1 : (arg0.field3051.field3073 == arg1.field3051.field3073 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3595((class205) arg0, (class205) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
