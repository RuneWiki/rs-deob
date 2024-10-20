package deob;

import java.util.Comparator;

@ObfuscatedName("o")
public final class class22 implements Comparator {

    @ObfuscatedName("o.x(Li;Li;I)I")
    public int method210(class17 arg0, class17 arg1) {
        return arg0.field77 < arg1.field77 ? -1 : (arg0.field77 == arg1.field77 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method210((class17) arg0, (class17) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
