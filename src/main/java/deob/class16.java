package deob;

import java.util.Comparator;

@ObfuscatedName("o")
public final class class16 implements Comparator {

    @ObfuscatedName("o.a(Ly;Ly;I)I")
    public int method75(class15 arg0, class15 arg1) {
        return arg0.field277.field291 < arg1.field277.field291 ? -1 : (arg0.field277.field291 == arg1.field277.field291 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method75((class15) arg0, (class15) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
