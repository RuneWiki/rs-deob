package deob;

import java.util.Comparator;

@ObfuscatedName("l")
public final class class16 implements Comparator {

    @ObfuscatedName("l.w(Lq;Lq;I)I")
    public int method73(class15 arg0, class15 arg1) {
        return arg0.field303.field319 < arg1.field303.field319 ? -1 : (arg0.field303.field319 == arg1.field303.field319 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method73((class15) arg0, (class15) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
