package deob;

import java.util.Comparator;

@ObfuscatedName("nf")
public final class class345 implements Comparator {

    @ObfuscatedName("nf.aj(Lnv;Lnv;I)I")
    public int method5974(class348 arg0, class348 arg1) {
        return arg0.field4257 < arg1.field4257 ? -1 : (arg0.field4257 == arg1.field4257 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method5974((class348) arg0, (class348) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
