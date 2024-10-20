package deob;

import java.util.Comparator;

@ObfuscatedName("l")
public final class class20 implements Comparator {

    @ObfuscatedName("l.x(Li;Li;B)I")
    public int method189(class17 arg0, class17 arg1) {
        return arg0.field86.field98 < arg1.field86.field98 ? -1 : (arg0.field86.field98 == arg1.field86.field98 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method189((class17) arg0, (class17) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
