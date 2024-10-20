package deob;

import java.util.Comparator;

@ObfuscatedName("hc")
public final class class218 implements Comparator {

    @ObfuscatedName("hc.a(Lhd;Lhd;I)I")
    public int method3785(class215 arg0, class215 arg1) {
        return arg0.field3154.field3172 < arg1.field3154.field3172 ? -1 : (arg0.field3154.field3172 == arg1.field3154.field3172 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3785((class215) arg0, (class215) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
