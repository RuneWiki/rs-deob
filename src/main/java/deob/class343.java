package deob;

import java.util.Comparator;

@ObfuscatedName("mx")
public final class class343 implements Comparator {

    @ObfuscatedName("mx.h(Lmg;Lmg;I)I")
    public int method6013(class341 arg0, class341 arg1) {
        return arg0.field4268.field4271 < arg1.field4268.field4271 ? -1 : (arg0.field4268.field4271 == arg1.field4268.field4271 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method6013((class341) arg0, (class341) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
