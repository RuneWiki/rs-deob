package deob;

import java.util.Comparator;

@ObfuscatedName("gv")
public final class class201 implements Comparator {

    @ObfuscatedName("gv.v(Lgj;Lgj;I)I")
    public int method3444(class197 arg0, class197 arg1) {
        return arg0.field2940 < arg1.field2940 ? -1 : (arg0.field2940 == arg1.field2940 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3444((class197) arg0, (class197) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
