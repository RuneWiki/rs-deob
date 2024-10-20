package deob;

import java.util.Comparator;

@ObfuscatedName("a")
public final class class18 implements Comparator {

    @ObfuscatedName("a.x(Li;Li;B)I")
    public int method140(class17 arg0, class17 arg1) {
        return arg0.field86.field101 < arg1.field86.field101 ? -1 : (arg0.field86.field101 == arg1.field86.field101 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method140((class17) arg0, (class17) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
