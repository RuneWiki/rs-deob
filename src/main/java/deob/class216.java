package deob;

import java.util.Comparator;

@ObfuscatedName("hi")
public final class class216 implements Comparator {

    @ObfuscatedName("hi.f(Lhq;Lhq;I)I")
    public int method3702(class214 arg0, class214 arg1) {
        return arg0.field3137.field3158 < arg1.field3137.field3158 ? -1 : (arg0.field3137.field3158 == arg1.field3137.field3158 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3702((class214) arg0, (class214) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
