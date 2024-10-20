package deob;

import java.util.Comparator;

@ObfuscatedName("hk")
public final class class211 implements Comparator {

    @ObfuscatedName("hk.j(Lgs;Lgs;I)I")
    public int method3611(class208 arg0, class208 arg1) {
        return arg0.field3074.field3097 < arg1.field3074.field3097 ? -1 : (arg0.field3074.field3097 == arg1.field3074.field3097 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3611((class208) arg0, (class208) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
