package deob;

import java.util.Comparator;

@ObfuscatedName("ha")
public final class class219 implements Comparator {

    @ObfuscatedName("ha.a(Lhg;Lhg;I)I")
    public int method3732(class214 arg0, class214 arg1) {
        return arg0.field3143 < arg1.field3143 ? -1 : (arg0.field3143 == arg1.field3143 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3732((class214) arg0, (class214) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
