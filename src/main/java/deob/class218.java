package deob;

import java.util.Comparator;

@ObfuscatedName("hz")
public final class class218 implements Comparator {

    @ObfuscatedName("hz.h(Lhh;Lhh;B)I")
    public int method3684(class214 arg0, class214 arg1) {
        return arg0.field3131 < arg1.field3131 ? -1 : (arg0.field3131 == arg1.field3131 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3684((class214) arg0, (class214) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
