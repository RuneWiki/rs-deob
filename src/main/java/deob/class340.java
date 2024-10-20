package deob;

import java.util.Comparator;

@ObfuscatedName("mt")
public final class class340 implements Comparator {

    @ObfuscatedName("mt.h(Lmg;Lmg;I)I")
    public int method5983(class341 arg0, class341 arg1) {
        return arg0.field4266 < arg1.field4266 ? -1 : (arg0.field4266 == arg1.field4266 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method5983((class341) arg0, (class341) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
