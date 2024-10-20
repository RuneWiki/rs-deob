package deob;

import java.util.Comparator;

@ObfuscatedName("he")
public final class class216 implements Comparator {

    @ObfuscatedName("he.a(Lhg;Lhg;B)I")
    public int method3706(class214 arg0, class214 arg1) {
        return arg0.field3140.field3163 < arg1.field3140.field3163 ? -1 : (arg0.field3140.field3163 == arg1.field3140.field3163 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3706((class214) arg0, (class214) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
