package deob;

import java.util.Comparator;

@ObfuscatedName("ht")
public final class class218 implements Comparator {

    @ObfuscatedName("ht.f(Lhq;Lhq;I)I")
    public int method3716(class214 arg0, class214 arg1) {
        return arg0.field3138 < arg1.field3138 ? -1 : (arg0.field3138 == arg1.field3138 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3716((class214) arg0, (class214) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
