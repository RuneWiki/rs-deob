package deob;

import java.util.Comparator;

@ObfuscatedName("b")
public final class class18 implements Comparator {

    @ObfuscatedName("b.h(La;La;B)I")
    public int method137(class17 arg0, class17 arg1) {
        return arg0.field73.field79 < arg1.field73.field79 ? -1 : (arg0.field73.field79 == arg1.field73.field79 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method137((class17) arg0, (class17) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
