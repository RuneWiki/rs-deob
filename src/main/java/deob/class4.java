package deob;

import java.util.Comparator;

@ObfuscatedName("a")
public final class class4 implements Comparator {

    @ObfuscatedName("a.u(Li;Li;I)I")
    public int method38(class3 arg0, class3 arg1) {
        return arg0.field16.field35 < arg1.field16.field35 ? -1 : (arg0.field16.field35 == arg1.field16.field35 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method38((class3) arg0, (class3) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
