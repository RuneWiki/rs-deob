package deob;

import java.util.Comparator;

@ObfuscatedName("i")
public final class class18 implements Comparator {

    @ObfuscatedName("i.a(Ly;Ly;B)I")
    public int method102(class15 arg0, class15 arg1) {
        return arg0.field277.field290 < arg1.field277.field290 ? -1 : (arg0.field277.field290 == arg1.field277.field290 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method102((class15) arg0, (class15) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
