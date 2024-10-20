package deob;

import java.util.Comparator;

@ObfuscatedName("ht")
public final class class220 implements Comparator {

    @ObfuscatedName("ht.j(Lhp;Lhp;I)I")
    public int method3719(class215 arg0, class215 arg1) {
        return arg0.field3163 < arg1.field3163 ? -1 : (arg0.field3163 == arg1.field3163 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3719((class215) arg0, (class215) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
