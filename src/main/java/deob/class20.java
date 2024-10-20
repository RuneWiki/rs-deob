package deob;

import java.util.Comparator;

@ObfuscatedName("g")
public final class class20 implements Comparator {

    @ObfuscatedName("g.m(Lk;Lk;I)I")
    public int method155(class15 arg0, class15 arg1) {
        return arg0.field285 < arg1.field285 ? -1 : (arg0.field285 == arg1.field285 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method155((class15) arg0, (class15) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
