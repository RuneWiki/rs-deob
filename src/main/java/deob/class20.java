package deob;

import java.util.Comparator;

@ObfuscatedName("l")
public final class class20 implements Comparator {

    @ObfuscatedName("l.p(Lg;Lg;I)I")
    public int method141(class15 arg0, class15 arg1) {
        return arg0.field292 < arg1.field292 ? -1 : (arg0.field292 == arg1.field292 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method141((class15) arg0, (class15) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
