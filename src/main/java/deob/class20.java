package deob;

import java.util.Comparator;

@ObfuscatedName("w")
public final class class20 implements Comparator {

    @ObfuscatedName("w.f(Ly;Ly;S)I")
    public int method177(class17 arg0, class17 arg1) {
        return arg0.field80.field84 < arg1.field80.field84 ? -1 : (arg0.field80.field84 == arg1.field80.field84 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method177((class17) arg0, (class17) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
