package deob;

import java.util.Comparator;

@ObfuscatedName("gi")
public final class class208 implements Comparator {

    @ObfuscatedName("gi.p(Lge;Lge;I)I")
    public int method3578(class205 arg0, class205 arg1) {
        return arg0.field3050.field3071 < arg1.field3050.field3071 ? -1 : (arg0.field3050.field3071 == arg1.field3050.field3071 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3578((class205) arg0, (class205) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
