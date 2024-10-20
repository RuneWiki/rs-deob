package deob;

import java.util.Comparator;

@ObfuscatedName("x")
public final class class9 implements Comparator {

    @ObfuscatedName("x.s(Lq;Lq;I)I")
    public int method69(class8 arg0, class8 arg1) {
        return arg0.field49.field62 < arg1.field49.field62 ? -1 : (arg0.field49.field62 == arg1.field49.field62 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method69((class8) arg0, (class8) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
