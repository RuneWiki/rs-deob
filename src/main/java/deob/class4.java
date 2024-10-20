package deob;

import java.util.Comparator;

@ObfuscatedName("l")
public final class class4 implements Comparator {

    @ObfuscatedName("l.b(Lc;Lc;S)I")
    public int method36(class3 arg0, class3 arg1) {
        return arg0.field25.field50 < arg1.field25.field50 ? -1 : (arg0.field25.field50 == arg1.field25.field50 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method36((class3) arg0, (class3) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
