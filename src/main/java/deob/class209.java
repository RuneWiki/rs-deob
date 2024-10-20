package deob;

import java.util.Comparator;

@ObfuscatedName("hb")
public final class class209 implements Comparator {

    @ObfuscatedName("hb.b(Lgk;Lgk;I)I")
    public int method3479(class205 arg0, class205 arg1) {
        return arg0.field3043 < arg1.field3043 ? -1 : (arg0.field3043 == arg1.field3043 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3479((class205) arg0, (class205) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
