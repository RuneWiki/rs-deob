package deob;

import java.util.Comparator;

@ObfuscatedName("kv")
public final class class297 implements Comparator {

    @ObfuscatedName("kv.n(Lko;Lko;I)I")
    public int method4854(class298 arg0, class298 arg1) {
        return arg0.field3759 < arg1.field3759 ? -1 : (arg0.field3759 == arg1.field3759 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method4854((class298) arg0, (class298) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
