package deob;

import java.util.Comparator;

@ObfuscatedName("a")
public final class class6 implements Comparator {

    @ObfuscatedName("a.n(Lz;Lz;I)I")
    public int method37(class8 arg0, class8 arg1) {
        return arg0.field48 < arg1.field48 ? -1 : (arg0.field48 == arg1.field48 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method37((class8) arg0, (class8) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
