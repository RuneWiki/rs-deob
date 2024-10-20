package deob;

import java.util.Comparator;

@ObfuscatedName("n")
public final class class18 implements Comparator {

    @ObfuscatedName("n.w(Lq;Lq;I)I")
    public int method107(class15 arg0, class15 arg1) {
        return arg0.field303.field318 < arg1.field303.field318 ? -1 : (arg0.field303.field318 == arg1.field303.field318 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method107((class15) arg0, (class15) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
