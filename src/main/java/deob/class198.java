package deob;

import java.util.Comparator;

@ObfuscatedName("gs")
public final class class198 implements Comparator {

    @ObfuscatedName("gs.e(Lgx;Lgx;I)I")
    public int method3374(class195 arg0, class195 arg1) {
        return arg0.field2924.field2941 < arg1.field2924.field2941 ? -1 : (arg0.field2924.field2941 == arg1.field2924.field2941 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3374((class195) arg0, (class195) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
