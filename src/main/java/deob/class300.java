package deob;

import java.util.Comparator;

@ObfuscatedName("kp")
public final class class300 implements Comparator {

    @ObfuscatedName("kp.i(Lkt;Lkt;B)I")
    public int method4906(class298 arg0, class298 arg1) {
        return arg0.field3747.field3752 < arg1.field3747.field3752 ? -1 : (arg0.field3747.field3752 == arg1.field3747.field3752 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method4906((class298) arg0, (class298) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
