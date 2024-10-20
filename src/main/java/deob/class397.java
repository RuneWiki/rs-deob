package deob;

import java.util.Comparator;

@ObfuscatedName("pf")
public final class class397 implements Comparator {

    @ObfuscatedName("pf.ak(Lpm;Lpm;S)I")
    public int method6763(class395 arg0, class395 arg1) {
        return arg0.field4566.field4572 < arg1.field4566.field4572 ? -1 : (arg0.field4566.field4572 == arg1.field4566.field4572 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method6763((class395) arg0, (class395) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
