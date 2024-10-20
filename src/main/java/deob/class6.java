package deob;

import java.util.Comparator;

@ObfuscatedName("b")
public final class class6 implements Comparator {

    @ObfuscatedName("b.f(Lx;Lx;I)I")
    public int method42(class8 arg0, class8 arg1) {
        return arg0.field37 < arg1.field37 ? -1 : (arg0.field37 == arg1.field37 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method42((class8) arg0, (class8) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
