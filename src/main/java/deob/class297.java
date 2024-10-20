package deob;

import java.util.Comparator;

@ObfuscatedName("ku")
public final class class297 implements Comparator {

    @ObfuscatedName("ku.i(Lkt;Lkt;I)I")
    public int method4863(class298 arg0, class298 arg1) {
        return arg0.field3748 < arg1.field3748 ? -1 : (arg0.field3748 == arg1.field3748 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method4863((class298) arg0, (class298) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
