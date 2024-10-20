package deob;

import java.util.Comparator;

@ObfuscatedName("r")
public final class class6 implements Comparator {

    @ObfuscatedName("r.n(Lm;Lm;I)I")
    public int method74(class3 arg0, class3 arg1) {
        return arg0.field24.field43 < arg1.field24.field43 ? -1 : (arg0.field24.field43 == arg1.field24.field43 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method74((class3) arg0, (class3) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
