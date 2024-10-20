package deob;

import java.util.Comparator;

@ObfuscatedName("hj")
public final class class216 implements Comparator {

    @ObfuscatedName("hj.o(Lhv;Lhv;I)I")
    public int method3705(class214 arg0, class214 arg1) {
        return arg0.field3140.field3160 < arg1.field3140.field3160 ? -1 : (arg0.field3140.field3160 == arg1.field3140.field3160 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3705((class214) arg0, (class214) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
