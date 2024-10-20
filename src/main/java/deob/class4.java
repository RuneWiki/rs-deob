package deob;

import java.util.Comparator;

@ObfuscatedName("h")
public final class class4 implements Comparator {

    @ObfuscatedName("h.n(Lm;Lm;B)I")
    public int method36(class3 arg0, class3 arg1) {
        return arg0.field24.field49 < arg1.field24.field49 ? -1 : (arg0.field24.field49 == arg1.field24.field49 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method36((class3) arg0, (class3) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
