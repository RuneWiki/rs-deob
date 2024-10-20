package deob;

import java.util.Comparator;

@ObfuscatedName("nw")
public final class class347 implements Comparator {

    @ObfuscatedName("nw.aj(Lnv;Lnv;I)I")
    public int method5976(class348 arg0, class348 arg1) {
        return arg0.field4258 < arg1.field4258 ? -1 : (arg0.field4258 == arg1.field4258 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method5976((class348) arg0, (class348) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
