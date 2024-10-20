package deob;

import java.util.Comparator;

@ObfuscatedName("ma")
public final class class342 implements Comparator {

    @ObfuscatedName("ma.f(Lmv;Lmv;I)I")
    public int method6118(class345 arg0, class345 arg1) {
        return arg0.field4284 < arg1.field4284 ? -1 : (arg0.field4284 == arg1.field4284 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method6118((class345) arg0, (class345) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
