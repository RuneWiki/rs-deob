package deob;

import java.util.Comparator;

@ObfuscatedName("m")
public final class class18 implements Comparator {

    @ObfuscatedName("m.i(Lj;Lj;I)I")
    public int method91(class15 arg0, class15 arg1) {
        return arg0.field287.field303 < arg1.field287.field303 ? -1 : (arg0.field287.field303 == arg1.field287.field303 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method91((class15) arg0, (class15) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
