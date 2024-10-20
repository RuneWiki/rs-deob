package deob;

import java.util.Comparator;

@ObfuscatedName("r")
public final class class4 implements Comparator {

    @ObfuscatedName("r.k(Lo;Lo;I)I")
    public int method43(class3 arg0, class3 arg1) {
        return arg0.field23.field41 < arg1.field23.field41 ? -1 : (arg0.field23.field41 == arg1.field23.field41 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method43((class3) arg0, (class3) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
