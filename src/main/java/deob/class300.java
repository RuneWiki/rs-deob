package deob;

import java.util.Comparator;

@ObfuscatedName("kd")
public final class class300 implements Comparator {

    @ObfuscatedName("kd.n(Lko;Lko;B)I")
    public int method4893(class298 arg0, class298 arg1) {
        return arg0.field3760.field3766 < arg1.field3760.field3766 ? -1 : (arg0.field3760.field3766 == arg1.field3760.field3766 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method4893((class298) arg0, (class298) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
