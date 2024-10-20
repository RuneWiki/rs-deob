package deob;

import java.util.Comparator;

@ObfuscatedName("c")
public final class class18 implements Comparator {

    @ObfuscatedName("c.b(Lj;Lj;I)I")
    public int method114(class15 arg0, class15 arg1) {
        return arg0.field277.field283 < arg1.field277.field283 ? -1 : (arg0.field277.field283 == arg1.field277.field283 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method114((class15) arg0, (class15) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
