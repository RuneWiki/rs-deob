package deob;

import java.util.Comparator;

@ObfuscatedName("gd")
public final class class199 implements Comparator {

    @ObfuscatedName("gd.v(Lgj;Lgj;I)I")
    public int method3430(class197 arg0, class197 arg1) {
        return arg0.field2944.field2962 < arg1.field2944.field2962 ? -1 : (arg0.field2944.field2962 == arg1.field2944.field2962 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3430((class197) arg0, (class197) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
