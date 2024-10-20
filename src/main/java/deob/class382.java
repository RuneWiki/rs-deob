package deob;

import java.util.Comparator;

@ObfuscatedName("om")
public final class class382 implements Comparator {

    @ObfuscatedName("om.am(Loo;Loo;I)I")
    public int method6557(class383 arg0, class383 arg1) {
        return arg0.field4420 < arg1.field4420 ? -1 : (arg0.field4420 == arg1.field4420 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method6557((class383) arg0, (class383) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
