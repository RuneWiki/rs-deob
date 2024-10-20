package deob;

import java.util.Comparator;

@ObfuscatedName("hg")
public final class class217 implements Comparator {

    @ObfuscatedName("hg.s(Lhc;Lhc;I)I")
    public int method3673(class215 arg0, class215 arg1) {
        return arg0.field3160.field3178 < arg1.field3160.field3178 ? -1 : (arg0.field3160.field3178 == arg1.field3160.field3178 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3673((class215) arg0, (class215) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
