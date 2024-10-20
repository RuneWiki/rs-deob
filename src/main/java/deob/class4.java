package deob;

import java.util.Comparator;

@ObfuscatedName("b")
public final class class4 implements Comparator {

    @ObfuscatedName("b.w(Lq;Lq;I)I")
    public int method27(class3 arg0, class3 arg1) {
        return arg0.field14.field29 < arg1.field14.field29 ? -1 : (arg0.field14.field29 == arg1.field14.field29 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method27((class3) arg0, (class3) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
