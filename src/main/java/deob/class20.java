package deob;

import java.util.Comparator;

@ObfuscatedName("e")
public final class class20 implements Comparator {

    @ObfuscatedName("e.m(Ls;Ls;B)I")
    public int method174(class17 arg0, class17 arg1) {
        return arg0.field69.field81 < arg1.field69.field81 ? -1 : (arg0.field69.field81 == arg1.field69.field81 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method174((class17) arg0, (class17) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
