package deob;

import java.util.Comparator;

@ObfuscatedName("ha")
public final class class219 implements Comparator {

    @ObfuscatedName("ha.f(Lhq;Lhq;I)I")
    public int method3723(class214 arg0, class214 arg1) {
        return arg0.field3139 < arg1.field3139 ? -1 : (arg0.field3139 == arg1.field3139 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3723((class214) arg0, (class214) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
