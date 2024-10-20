package deob;

import java.util.Comparator;

@ObfuscatedName("hm")
public final class class218 implements Comparator {

    @ObfuscatedName("hm.z(Lhh;Lhh;I)I")
    public int method3636(class214 arg0, class214 arg1) {
        return arg0.field3136 < arg1.field3136 ? -1 : (arg0.field3136 == arg1.field3136 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3636((class214) arg0, (class214) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
