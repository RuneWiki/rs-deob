package deob;

import java.util.Comparator;

@ObfuscatedName("lo")
public final class class335 implements Comparator {

    @ObfuscatedName("lo.a(Llp;Llp;I)I")
    public int method5906(class338 arg0, class338 arg1) {
        return arg0.field4205 < arg1.field4205 ? -1 : (arg0.field4205 == arg1.field4205 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method5906((class338) arg0, (class338) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
