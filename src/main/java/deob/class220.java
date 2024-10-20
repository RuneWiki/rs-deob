package deob;

import java.util.Comparator;

@ObfuscatedName("ht")
public final class class220 implements Comparator {

    @ObfuscatedName("ht.f(Lhn;Lhn;I)I")
    public int method3788(class218 arg0, class218 arg1) {
        return arg0.field3195.field3221 < arg1.field3195.field3221 ? -1 : (arg0.field3195.field3221 == arg1.field3195.field3221 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3788((class218) arg0, (class218) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
