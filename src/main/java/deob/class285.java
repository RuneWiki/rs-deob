package deob;

import java.util.Comparator;

@ObfuscatedName("jz")
public final class class285 implements Comparator {

    @ObfuscatedName("jz.v(Ljs;Ljs;I)I")
    public int method4649(class283 arg0, class283 arg1) {
        return arg0.field3649.field3659 < arg1.field3649.field3659 ? -1 : (arg0.field3649.field3659 == arg1.field3649.field3659 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method4649((class283) arg0, (class283) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
