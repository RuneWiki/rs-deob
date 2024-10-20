package deob;

import java.util.Comparator;

@ObfuscatedName("j")
public final class class16 implements Comparator {

    @ObfuscatedName("j.i(Lo;Lo;I)I")
    public int method85(class15 arg0, class15 arg1) {
        return arg0.field287.field298 < arg1.field287.field298 ? -1 : (arg0.field287.field298 == arg1.field287.field298 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method85((class15) arg0, (class15) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
