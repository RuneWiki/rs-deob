package deob;

import java.util.Comparator;

@ObfuscatedName("m")
public final class class16 implements Comparator {

    @ObfuscatedName("m.i(Lc;Lc;B)I")
    public int method75(class15 arg0, class15 arg1) {
        return arg0.field286.field304 < arg1.field286.field304 ? -1 : (arg0.field286.field304 == arg1.field286.field304 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method75((class15) arg0, (class15) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
