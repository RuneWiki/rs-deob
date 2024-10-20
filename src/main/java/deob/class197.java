package deob;

import java.util.Comparator;

@ObfuscatedName("gn")
public final class class197 implements Comparator {

    @ObfuscatedName("gn.l(Lga;Lga;I)I")
    public int method3418(class195 arg0, class195 arg1) {
        return arg0.field2919.field2938 < arg1.field2919.field2938 ? -1 : (arg0.field2919.field2938 == arg1.field2919.field2938 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3418((class195) arg0, (class195) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
