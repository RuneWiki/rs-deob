package deob;

import java.util.Comparator;

@ObfuscatedName("v")
public final class class16 implements Comparator {

    @ObfuscatedName("v.p(Lg;Lg;I)I")
    public int method91(class15 arg0, class15 arg1) {
        return arg0.field293.field315 < arg1.field293.field315 ? -1 : (arg0.field293.field315 == arg1.field293.field315 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method91((class15) arg0, (class15) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
