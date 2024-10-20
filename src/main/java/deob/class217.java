package deob;

import java.util.Comparator;

@ObfuscatedName("hy")
public final class class217 implements Comparator {

    @ObfuscatedName("hy.a(Lhg;Lhg;I)I")
    public int method3721(class214 arg0, class214 arg1) {
        return arg0.field3140.field3165 < arg1.field3140.field3165 ? -1 : (arg0.field3140.field3165 == arg1.field3140.field3165 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3721((class214) arg0, (class214) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
