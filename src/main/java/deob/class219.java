package deob;

import java.util.Comparator;

@ObfuscatedName("hf")
public final class class219 implements Comparator {

    @ObfuscatedName("hf.l(Lhk;Lhk;I)I")
    public int method3687(class214 arg0, class214 arg1) {
        return arg0.field3137 < arg1.field3137 ? -1 : (arg0.field3137 == arg1.field3137 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3687((class214) arg0, (class214) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
