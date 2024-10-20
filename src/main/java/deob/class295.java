package deob;

import java.util.Comparator;

@ObfuscatedName("ky")
public final class class295 implements Comparator {

    @ObfuscatedName("ky.n(Lko;Lko;B)I")
    public int method4848(class298 arg0, class298 arg1) {
        return arg0.field3762 < arg1.field3762 ? -1 : (arg0.field3762 == arg1.field3762 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method4848((class298) arg0, (class298) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
