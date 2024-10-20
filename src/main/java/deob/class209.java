package deob;

import java.util.Comparator;

@ObfuscatedName("ho")
public final class class209 implements Comparator {

    @ObfuscatedName("ho.y(Lgv;Lgv;I)I")
    public int method3553(class205 arg0, class205 arg1) {
        return arg0.field3055 < arg1.field3055 ? -1 : (arg0.field3055 == arg1.field3055 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3553((class205) arg0, (class205) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
