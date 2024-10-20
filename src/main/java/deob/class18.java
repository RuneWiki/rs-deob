package deob;

import java.util.Comparator;

@ObfuscatedName("d")
public final class class18 implements Comparator {

    @ObfuscatedName("d.i(Lo;Lo;I)I")
    public int method108(class15 arg0, class15 arg1) {
        return arg0.field287.field300 < arg1.field287.field300 ? -1 : (arg0.field287.field300 == arg1.field287.field300 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method108((class15) arg0, (class15) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
