package deob;

import java.util.Comparator;

@ObfuscatedName("hs")
public final class class218 implements Comparator {

    @ObfuscatedName("hs.n(Lhe;Lhe;I)I")
    public int method3706(class214 arg0, class214 arg1) {
        return arg0.field3144 < arg1.field3144 ? -1 : (arg0.field3144 == arg1.field3144 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3706((class214) arg0, (class214) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
