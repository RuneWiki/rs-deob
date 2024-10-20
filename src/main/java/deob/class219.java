package deob;

import java.util.Comparator;

@ObfuscatedName("hq")
public final class class219 implements Comparator {

    @ObfuscatedName("hq.t(Lhw;Lhw;I)I")
    public int method3647(class215 arg0, class215 arg1) {
        return arg0.field3157 < arg1.field3157 ? -1 : (arg0.field3157 == arg1.field3157 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3647((class215) arg0, (class215) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
