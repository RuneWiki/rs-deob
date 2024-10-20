package deob;

import java.util.Comparator;

@ObfuscatedName("gy")
public final class class198 implements Comparator {

    @ObfuscatedName("gy.l(Lga;Lga;I)I")
    public int method3431(class195 arg0, class195 arg1) {
        return arg0.field2919.field2939 < arg1.field2919.field2939 ? -1 : (arg0.field2919.field2939 == arg1.field2919.field2939 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3431((class195) arg0, (class195) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
