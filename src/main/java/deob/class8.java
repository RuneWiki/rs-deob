package deob;

import java.util.Comparator;

@ObfuscatedName("p")
public final class class8 implements Comparator {

    @ObfuscatedName("p.y(Ln;Ln;B)I")
    public int method78(class3 arg0, class3 arg1) {
        return arg0.field15 < arg1.field15 ? -1 : (arg0.field15 == arg1.field15 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method78((class3) arg0, (class3) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
