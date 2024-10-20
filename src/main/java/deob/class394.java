package deob;

import java.util.Comparator;

@ObfuscatedName("pj")
public final class class394 implements Comparator {

    @ObfuscatedName("pj.ab(Lpx;Lpx;I)I")
    public int method6786(class397 arg0, class397 arg1) {
        return arg0.field4560 < arg1.field4560 ? -1 : (arg0.field4560 == arg1.field4560 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method6786((class397) arg0, (class397) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
