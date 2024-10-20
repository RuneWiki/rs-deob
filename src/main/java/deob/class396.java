package deob;

import java.util.Comparator;

@ObfuscatedName("ph")
public final class class396 implements Comparator {

    @ObfuscatedName("ph.ab(Lpx;Lpx;I)I")
    public int method6796(class397 arg0, class397 arg1) {
        return arg0.field4564 < arg1.field4564 ? -1 : (arg0.field4564 == arg1.field4564 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method6796((class397) arg0, (class397) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
