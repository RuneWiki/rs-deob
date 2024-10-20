package deob;

import java.util.Comparator;

@ObfuscatedName("gj")
public final class class197 implements Comparator {

    @ObfuscatedName("gj.e(Lgx;Lgx;I)I")
    public int method3372(class195 arg0, class195 arg1) {
        return arg0.field2924.field2940 < arg1.field2924.field2940 ? -1 : (arg0.field2924.field2940 == arg1.field2924.field2940 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3372((class195) arg0, (class195) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
