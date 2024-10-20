package deob;

import java.util.Comparator;

@ObfuscatedName("k")
public final class class18 implements Comparator {

    @ObfuscatedName("k.d(Lu;Lu;I)I")
    public int method109(class15 arg0, class15 arg1) {
        return arg0.field280.field297 < arg1.field280.field297 ? -1 : (arg0.field280.field297 == arg1.field280.field297 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method109((class15) arg0, (class15) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
