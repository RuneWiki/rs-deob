package deob;

import java.util.Comparator;

@ObfuscatedName("ib")
public final class class260 implements Comparator {

    @ObfuscatedName("ib.f(Ljt;Ljt;B)I")
    public int method4057(class261 arg0, class261 arg1) {
        return arg0.field3322 < arg1.field3322 ? -1 : (arg0.field3322 == arg1.field3322 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method4057((class261) arg0, (class261) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
