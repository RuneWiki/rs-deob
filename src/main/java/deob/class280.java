package deob;

import java.util.Comparator;

@ObfuscatedName("jp")
public final class class280 implements Comparator {

    @ObfuscatedName("jp.s(Ljj;Ljj;B)I")
    public int method4558(class285 arg0, class285 arg1) {
        return arg0.field3647.field3653 < arg1.field3647.field3653 ? -1 : (arg0.field3647.field3653 == arg1.field3647.field3653 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method4558((class285) arg0, (class285) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
