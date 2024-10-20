package deob;

import java.util.Comparator;

@ObfuscatedName("hb")
public final class class218 implements Comparator {

    @ObfuscatedName("hb.t(Lhw;Lhw;B)I")
    public int method3642(class215 arg0, class215 arg1) {
        return arg0.field3158.field3177 < arg1.field3158.field3177 ? -1 : (arg0.field3158.field3177 == arg1.field3158.field3177 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3642((class215) arg0, (class215) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
