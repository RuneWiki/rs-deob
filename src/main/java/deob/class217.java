package deob;

import java.util.Comparator;

@ObfuscatedName("he")
public final class class217 implements Comparator {

    @ObfuscatedName("he.j(Lhp;Lhp;I)I")
    public int method3655(class214 arg0, class214 arg1) {
        return arg0.field3143.field3170 < arg1.field3143.field3170 ? -1 : (arg0.field3143.field3170 == arg1.field3143.field3170 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3655((class214) arg0, (class214) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
