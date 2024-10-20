package deob;

import java.util.Comparator;

@ObfuscatedName("hj")
public final class class220 implements Comparator {

    @ObfuscatedName("hj.f(Lho;Lho;I)I")
    public int method3740(class215 arg0, class215 arg1) {
        return arg0.field3150 < arg1.field3150 ? -1 : (arg0.field3150 == arg1.field3150 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3740((class215) arg0, (class215) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
