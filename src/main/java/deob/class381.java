package deob;

import java.util.Comparator;

@ObfuscatedName("oc")
public final class class381 implements Comparator {

    @ObfuscatedName("oc.aq(Loj;Loj;I)I")
    public int method6553(class386 arg0, class386 arg1) {
        return arg0.field4454.field4461 < arg1.field4454.field4461 ? -1 : (arg0.field4454.field4461 == arg1.field4454.field4461 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method6553((class386) arg0, (class386) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
