package deob;

import java.util.Comparator;

@ObfuscatedName("s")
public final class class4 implements Comparator {

    @ObfuscatedName("s.f(Lw;Lw;I)I")
    public int method25(class3 arg0, class3 arg1) {
        return arg0.field15.field32 < arg1.field15.field32 ? -1 : (arg0.field15.field32 == arg1.field15.field32 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method25((class3) arg0, (class3) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
