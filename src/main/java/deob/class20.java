package deob;

import java.util.Comparator;

@ObfuscatedName("u")
public final class class20 implements Comparator {

    @ObfuscatedName("u.n(Lx;Lx;B)I")
    public int method166(class17 arg0, class17 arg1) {
        return arg0.field84.field95 < arg1.field84.field95 ? -1 : (arg0.field84.field95 == arg1.field84.field95 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method166((class17) arg0, (class17) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
