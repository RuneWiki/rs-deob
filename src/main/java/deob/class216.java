package deob;

import java.util.Comparator;

@ObfuscatedName("hu")
public final class class216 implements Comparator {

    @ObfuscatedName("hu.h(Lhh;Lhh;B)I")
    public int method3667(class214 arg0, class214 arg1) {
        return arg0.field3132.field3146 < arg1.field3132.field3146 ? -1 : (arg0.field3132.field3146 == arg1.field3132.field3146 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3667((class214) arg0, (class214) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
