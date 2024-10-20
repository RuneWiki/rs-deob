package deob;

import java.util.Comparator;

@ObfuscatedName("a")
public final class class6 implements Comparator {

    @ObfuscatedName("a.f(Lw;Lw;I)I")
    public int method53(class3 arg0, class3 arg1) {
        return arg0.field15.field37 < arg1.field15.field37 ? -1 : (arg0.field15.field37 == arg1.field15.field37 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method53((class3) arg0, (class3) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
