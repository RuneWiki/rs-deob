package deob;

import java.util.Comparator;

@ObfuscatedName("hh")
public final class class220 implements Comparator {

    @ObfuscatedName("hh.s(Lhc;Lhc;B)I")
    public int method3704(class215 arg0, class215 arg1) {
        return arg0.field3162 < arg1.field3162 ? -1 : (arg0.field3162 == arg1.field3162 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3704((class215) arg0, (class215) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
