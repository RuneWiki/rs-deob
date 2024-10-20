package deob;

import java.util.Comparator;

@ObfuscatedName("n")
public final class class6 implements Comparator {

    @ObfuscatedName("n.q(Lh;Lh;I)I")
    public int method60(class3 arg0, class3 arg1) {
        return arg0.field27.field55 < arg1.field27.field55 ? -1 : (arg0.field27.field55 == arg1.field27.field55 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method60((class3) arg0, (class3) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
