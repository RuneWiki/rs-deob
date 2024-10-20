package deob;

import java.util.Comparator;

@ObfuscatedName("mx")
public final class class347 implements Comparator {

    @ObfuscatedName("mx.f(Lmv;Lmv;B)I")
    public int method6169(class345 arg0, class345 arg1) {
        return arg0.field4290.field4291 < arg1.field4290.field4291 ? -1 : (arg0.field4290.field4291 == arg1.field4290.field4291 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method6169((class345) arg0, (class345) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
