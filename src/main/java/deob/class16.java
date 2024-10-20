package deob;

import java.util.Comparator;

@ObfuscatedName("c")
public final class class16 implements Comparator {

    @ObfuscatedName("c.a(Lt;Lt;I)I")
    public int method82(class15 arg0, class15 arg1) {
        return arg0.field298.field311 < arg1.field298.field311 ? -1 : (arg0.field298.field311 == arg1.field298.field311 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method82((class15) arg0, (class15) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
