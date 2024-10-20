package deob;

import java.util.Comparator;

@ObfuscatedName("hi")
public final class class216 implements Comparator {

    @ObfuscatedName("hi.l(Lhk;Lhk;B)I")
    public int method3663(class214 arg0, class214 arg1) {
        return arg0.field3135.field3159 < arg1.field3135.field3159 ? -1 : (arg0.field3135.field3159 == arg1.field3135.field3159 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3663((class214) arg0, (class214) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
