package deob;

import java.util.Comparator;

@ObfuscatedName("hs")
public final class class217 implements Comparator {

    @ObfuscatedName("hs.e(Lhx;Lhx;I)I")
    public int method3665(class215 arg0, class215 arg1) {
        return arg0.field3147.field3171 < arg1.field3147.field3171 ? -1 : (arg0.field3147.field3171 == arg1.field3147.field3171 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3665((class215) arg0, (class215) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
