package deob;

import java.util.Comparator;

@ObfuscatedName("ga")
public final class class199 implements Comparator {

    @ObfuscatedName("ga.b(Lgy;Lgy;I)I")
    public int method3437(class197 arg0, class197 arg1) {
        return arg0.field2936.field2956 < arg1.field2936.field2956 ? -1 : (arg0.field2936.field2956 == arg1.field2936.field2956 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3437((class197) arg0, (class197) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
