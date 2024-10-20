package deob;

import java.util.Comparator;

@ObfuscatedName("gs")
public final class class208 implements Comparator {

    @ObfuscatedName("gs.t(Lgn;Lgn;B)I")
    public int method3559(class205 arg0, class205 arg1) {
        return arg0.field3051.field3068 < arg1.field3051.field3068 ? -1 : (arg0.field3051.field3068 == arg1.field3051.field3068 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3559((class205) arg0, (class205) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
