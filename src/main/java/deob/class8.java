package deob;

import java.util.Comparator;

@ObfuscatedName("c")
public final class class8 implements Comparator {

    @ObfuscatedName("c.q(Lh;Lh;I)I")
    public int method83(class3 arg0, class3 arg1) {
        return arg0.field26 < arg1.field26 ? -1 : (arg0.field26 == arg1.field26 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method83((class3) arg0, (class3) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
