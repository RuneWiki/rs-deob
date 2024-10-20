package deob;

import java.util.Comparator;

@ObfuscatedName("ju")
public final class class282 implements Comparator {

    @ObfuscatedName("ju.s(Ljj;Ljj;I)I")
    public int method4573(class285 arg0, class285 arg1) {
        return arg0.field3646 < arg1.field3646 ? -1 : (arg0.field3646 == arg1.field3646 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method4573((class285) arg0, (class285) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
