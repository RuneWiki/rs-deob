package deob;

import java.util.Comparator;

@ObfuscatedName("hd")
public final class class216 implements Comparator {

    @ObfuscatedName("hd.i(Lhk;Lhk;I)I")
    public int method3662(class214 arg0, class214 arg1) {
        return arg0.field3131.field3150 < arg1.field3131.field3150 ? -1 : (arg0.field3131.field3150 == arg1.field3131.field3150 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3662((class214) arg0, (class214) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
