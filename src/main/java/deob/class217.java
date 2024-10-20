package deob;

import java.util.Comparator;

@ObfuscatedName("hq")
public final class class217 implements Comparator {

    @ObfuscatedName("hq.o(Lhv;Lhv;I)I")
    public int method3712(class214 arg0, class214 arg1) {
        return arg0.field3140.field3156 < arg1.field3140.field3156 ? -1 : (arg0.field3140.field3156 == arg1.field3140.field3156 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3712((class214) arg0, (class214) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
