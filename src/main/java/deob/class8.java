package deob;

import java.util.Comparator;

@ObfuscatedName("s")
public final class class8 implements Comparator {

    @ObfuscatedName("s.p(Lx;Lx;I)I")
    public int method103(class3 arg0, class3 arg1) {
        return arg0.field18 < arg1.field18 ? -1 : (arg0.field18 == arg1.field18 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method103((class3) arg0, (class3) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
