package deob;

import java.util.Comparator;

@ObfuscatedName("kc")
public final class class300 implements Comparator {

    @ObfuscatedName("kc.l(Lkd;Lkd;I)I")
    public int method4950(class298 arg0, class298 arg1) {
        return arg0.field3758.field3764 < arg1.field3758.field3764 ? -1 : (arg0.field3758.field3764 == arg1.field3758.field3764 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method4950((class298) arg0, (class298) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
