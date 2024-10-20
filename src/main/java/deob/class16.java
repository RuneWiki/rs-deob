package deob;

import java.util.Comparator;

@ObfuscatedName("i")
public final class class16 implements Comparator {

    @ObfuscatedName("i.w(La;La;I)I")
    public int method78(class15 arg0, class15 arg1) {
        return arg0.field295.field315 < arg1.field295.field315 ? -1 : (arg0.field295.field315 == arg1.field295.field315 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method78((class15) arg0, (class15) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
