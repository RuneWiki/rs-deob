package deob;

import java.util.Comparator;

@ObfuscatedName("oa")
public final class class380 implements Comparator {

    @ObfuscatedName("oa.am(Loo;Loo;I)I")
    public int method6546(class383 arg0, class383 arg1) {
        return arg0.field4421 < arg1.field4421 ? -1 : (arg0.field4421 == arg1.field4421 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method6546((class383) arg0, (class383) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
