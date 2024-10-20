package deob;

import java.util.Comparator;

@ObfuscatedName("hc")
public final class class210 implements Comparator {

    @ObfuscatedName("hc.j(Lgs;Lgs;I)I")
    public int method3608(class208 arg0, class208 arg1) {
        return arg0.field3074.field3096 < arg1.field3074.field3096 ? -1 : (arg0.field3074.field3096 == arg1.field3074.field3096 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3608((class208) arg0, (class208) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
