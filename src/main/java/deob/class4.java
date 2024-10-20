package deob;

import java.util.Comparator;

@ObfuscatedName("k")
public final class class4 implements Comparator {

    @ObfuscatedName("k.v(Lo;Lo;I)I")
    public int method31(class3 arg0, class3 arg1) {
        return arg0.field21.field38 < arg1.field21.field38 ? -1 : (arg0.field21.field38 == arg1.field21.field38 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method31((class3) arg0, (class3) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
