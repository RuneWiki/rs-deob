package deob;

import java.util.Comparator;

@ObfuscatedName("pp")
public final class class399 implements Comparator {

    @ObfuscatedName("pp.ab(Lpx;Lpx;B)I")
    public int method6829(class397 arg0, class397 arg1) {
        return arg0.field4561.field4567 < arg1.field4561.field4567 ? -1 : (arg0.field4561.field4567 == arg1.field4561.field4567 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method6829((class397) arg0, (class397) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
