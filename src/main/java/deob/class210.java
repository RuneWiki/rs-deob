package deob;

import java.util.Comparator;

@ObfuscatedName("hu")
public final class class210 implements Comparator {

    @ObfuscatedName("hu.n(Lgy;Lgy;I)I")
    public int method3608(class205 arg0, class205 arg1) {
        return arg0.field3050 < arg1.field3050 ? -1 : (arg0.field3050 == arg1.field3050 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3608((class205) arg0, (class205) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
