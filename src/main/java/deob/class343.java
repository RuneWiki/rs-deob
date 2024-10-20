package deob;

import java.util.Comparator;

@ObfuscatedName("ng")
public final class class343 implements Comparator {

    @ObfuscatedName("ng.aj(Lnv;Lnv;I)I")
    public int method5957(class348 arg0, class348 arg1) {
        return arg0.field4256.field4264 < arg1.field4256.field4264 ? -1 : (arg0.field4256.field4264 == arg1.field4256.field4264 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method5957((class348) arg0, (class348) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
