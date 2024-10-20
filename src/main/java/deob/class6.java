package deob;

import java.util.Comparator;

@ObfuscatedName("g")
public final class class6 implements Comparator {

    @ObfuscatedName("g.s(Lf;Lf;B)I")
    public int method63(class3 arg0, class3 arg1) {
        return arg0.field24.field50 < arg1.field24.field50 ? -1 : (arg0.field24.field50 == arg1.field24.field50 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method63((class3) arg0, (class3) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
