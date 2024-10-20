package deob;

import java.util.Comparator;

@ObfuscatedName("lo")
public final class class338 implements Comparator {

    @ObfuscatedName("lo.h(Lmg;Lmg;B)I")
    public int method5978(class341 arg0, class341 arg1) {
        return arg0.field4265 < arg1.field4265 ? -1 : (arg0.field4265 == arg1.field4265 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method5978((class341) arg0, (class341) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
