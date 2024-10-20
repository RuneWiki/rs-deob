package deob;

import java.util.Comparator;

@ObfuscatedName("h")
public final class class15 implements Comparator {

    @ObfuscatedName("h.x(Li;Li;I)I")
    public int method105(class17 arg0, class17 arg1) {
        return arg0.field82 < arg1.field82 ? -1 : (arg0.field82 == arg1.field82 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method105((class17) arg0, (class17) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
