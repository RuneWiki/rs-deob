package deob;

import java.util.Comparator;

@ObfuscatedName("hs")
public final class class220 implements Comparator {

    @ObfuscatedName("hs.m(Lht;Lht;B)I")
    public int method3774(class218 arg0, class218 arg1) {
        return arg0.field3199.field3221 < arg1.field3199.field3221 ? -1 : (arg0.field3199.field3221 == arg1.field3199.field3221 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3774((class218) arg0, (class218) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
