package deob;

import java.util.Comparator;

@ObfuscatedName("h")
public final class class6 implements Comparator {

    @ObfuscatedName("h.x(Lc;Lc;I)I")
    public int method80(class3 arg0, class3 arg1) {
        return arg0.field26.field44 < arg1.field26.field44 ? -1 : (arg0.field26.field44 == arg1.field26.field44 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method80((class3) arg0, (class3) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
