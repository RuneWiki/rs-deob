package deob;

import java.util.Comparator;

@ObfuscatedName("hg")
public final class class209 implements Comparator {

    @ObfuscatedName("hg.n(Lgg;Lgg;I)I")
    public int method3614(class205 arg0, class205 arg1) {
        return arg0.field3045 < arg1.field3045 ? -1 : (arg0.field3045 == arg1.field3045 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3614((class205) arg0, (class205) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
