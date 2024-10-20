package deob;

import java.util.Comparator;

@ObfuscatedName("no")
public final class class350 implements Comparator {

    @ObfuscatedName("no.aj(Lnv;Lnv;I)I")
    public int method6009(class348 arg0, class348 arg1) {
        return arg0.field4256.field4263 < arg1.field4256.field4263 ? -1 : (arg0.field4256.field4263 == arg1.field4256.field4263 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method6009((class348) arg0, (class348) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
