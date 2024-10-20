package deob;

import java.util.Comparator;

@ObfuscatedName("hs")
public final class class218 implements Comparator {

    @ObfuscatedName("hs.j(Lhp;Lhp;I)I")
    public int method3663(class214 arg0, class214 arg1) {
        return arg0.field3144 < arg1.field3144 ? -1 : (arg0.field3144 == arg1.field3144 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3663((class214) arg0, (class214) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
