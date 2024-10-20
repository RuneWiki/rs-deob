package deob;

import java.util.Comparator;

@ObfuscatedName("hz")
public final class class220 implements Comparator {

    @ObfuscatedName("hz.l(Lha;Lha;I)I")
    public int method3854(class218 arg0, class218 arg1) {
        return arg0.field3207.field3215 < arg1.field3207.field3215 ? -1 : (arg0.field3207.field3215 == arg1.field3207.field3215 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3854((class218) arg0, (class218) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
