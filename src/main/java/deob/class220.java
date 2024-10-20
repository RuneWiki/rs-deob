package deob;

import java.util.Comparator;

@ObfuscatedName("hi")
public final class class220 implements Comparator {

    @ObfuscatedName("hi.t(Lhw;Lhw;I)I")
    public int method3655(class215 arg0, class215 arg1) {
        return arg0.field3161 < arg1.field3161 ? -1 : (arg0.field3161 == arg1.field3161 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3655((class215) arg0, (class215) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
