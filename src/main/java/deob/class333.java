package deob;

import java.util.Comparator;

@ObfuscatedName("ln")
public final class class333 implements Comparator {

    @ObfuscatedName("ln.a(Llp;Llp;I)I")
    public int method5890(class338 arg0, class338 arg1) {
        return arg0.field4207.field4217 < arg1.field4207.field4217 ? -1 : (arg0.field4207.field4217 == arg1.field4207.field4217 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method5890((class338) arg0, (class338) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
