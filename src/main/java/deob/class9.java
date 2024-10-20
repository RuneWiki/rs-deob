package deob;

import java.util.Comparator;

@ObfuscatedName("a")
public final class class9 implements Comparator {

    @ObfuscatedName("a.f(Lx;Lx;I)I")
    public int method70(class8 arg0, class8 arg1) {
        return arg0.field38.field55 < arg1.field38.field55 ? -1 : (arg0.field38.field55 == arg1.field38.field55 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method70((class8) arg0, (class8) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
