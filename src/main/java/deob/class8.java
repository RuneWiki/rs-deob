package deob;

import java.util.Comparator;

@ObfuscatedName("d")
public final class class8 implements Comparator {

    @ObfuscatedName("d.k(Lo;Lo;B)I")
    public int method103(class3 arg0, class3 arg1) {
        return arg0.field22 < arg1.field22 ? -1 : (arg0.field22 == arg1.field22 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method103((class3) arg0, (class3) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
