package deob;

import java.util.Comparator;

@ObfuscatedName("v")
public final class class18 implements Comparator {

    @ObfuscatedName("v.m(Ls;Ls;I)I")
    public int method135(class17 arg0, class17 arg1) {
        return arg0.field69.field83 < arg1.field69.field83 ? -1 : (arg0.field69.field83 == arg1.field69.field83 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method135((class17) arg0, (class17) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
