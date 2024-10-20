package deob;

import java.util.Comparator;

@ObfuscatedName("lx")
public final class class336 implements Comparator {

    @ObfuscatedName("lx.h(Lmg;Lmg;B)I")
    public int method5947(class341 arg0, class341 arg1) {
        return arg0.field4268.field4272 < arg1.field4268.field4272 ? -1 : (arg0.field4268.field4272 == arg1.field4268.field4272 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method5947((class341) arg0, (class341) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
