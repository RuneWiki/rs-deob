package deob;

import java.util.Comparator;

@ObfuscatedName("w")
public final class class18 implements Comparator {

    @ObfuscatedName("w.e(Lc;Lc;B)I")
    public int method90(class15 arg0, class15 arg1) {
        return arg0.field283.field303 < arg1.field283.field303 ? -1 : (arg0.field283.field303 == arg1.field283.field303 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method90((class15) arg0, (class15) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
