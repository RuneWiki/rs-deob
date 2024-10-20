package deob;

import java.util.Comparator;

@ObfuscatedName("kx")
public final class class297 implements Comparator {

    @ObfuscatedName("kx.l(Lkd;Lkd;S)I")
    public int method4910(class298 arg0, class298 arg1) {
        return arg0.field3757 < arg1.field3757 ? -1 : (arg0.field3757 == arg1.field3757 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method4910((class298) arg0, (class298) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
