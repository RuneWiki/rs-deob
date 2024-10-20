package deob;

import java.util.Comparator;

@ObfuscatedName("k")
public final class class15 implements Comparator {

    @ObfuscatedName("k.m(Ls;Ls;B)I")
    public int method112(class17 arg0, class17 arg1) {
        return arg0.field76 < arg1.field76 ? -1 : (arg0.field76 == arg1.field76 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method112((class17) arg0, (class17) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
