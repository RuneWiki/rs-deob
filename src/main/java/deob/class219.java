package deob;

import java.util.Comparator;

@ObfuscatedName("ho")
public final class class219 implements Comparator {

    @ObfuscatedName("ho.h(Lhh;Lhh;I)I")
    public int method3782(class214 arg0, class214 arg1) {
        return arg0.field3129 < arg1.field3129 ? -1 : (arg0.field3129 == arg1.field3129 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3782((class214) arg0, (class214) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
