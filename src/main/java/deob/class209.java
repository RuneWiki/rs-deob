package deob;

import java.util.Comparator;

@ObfuscatedName("hh")
public final class class209 implements Comparator {

    @ObfuscatedName("hh.n(Lgy;Lgy;I)I")
    public int method3532(class205 arg0, class205 arg1) {
        return arg0.field3046 < arg1.field3046 ? -1 : (arg0.field3046 == arg1.field3046 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3532((class205) arg0, (class205) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
