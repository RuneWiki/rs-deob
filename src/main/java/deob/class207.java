package deob;

import java.util.Comparator;

@ObfuscatedName("gs")
public final class class207 implements Comparator {

    @ObfuscatedName("gs.n(Lgy;Lgy;B)I")
    public int method3511(class205 arg0, class205 arg1) {
        return arg0.field3048.field3070 < arg1.field3048.field3070 ? -1 : (arg0.field3048.field3070 == arg1.field3048.field3070 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3511((class205) arg0, (class205) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
