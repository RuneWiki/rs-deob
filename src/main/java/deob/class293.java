package deob;

import java.util.Comparator;

@ObfuscatedName("kw")
public final class class293 implements Comparator {

    @ObfuscatedName("kw.n(Lko;Lko;S)I")
    public int method4816(class298 arg0, class298 arg1) {
        return arg0.field3760.field3769 < arg1.field3760.field3769 ? -1 : (arg0.field3760.field3769 == arg1.field3760.field3769 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method4816((class298) arg0, (class298) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
