package deob;

import java.util.Comparator;

@ObfuscatedName("k")
public final class class8 implements Comparator {

    @ObfuscatedName("k.x(Lc;Lc;B)I")
    public int method95(class3 arg0, class3 arg1) {
        return arg0.field25 < arg1.field25 ? -1 : (arg0.field25 == arg1.field25 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method95((class3) arg0, (class3) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
