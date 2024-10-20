package deob;

import java.util.Comparator;

@ObfuscatedName("pq")
public final class class392 implements Comparator {

    @ObfuscatedName("pq.ab(Lpx;Lpx;B)I")
    public int method6771(class397 arg0, class397 arg1) {
        return arg0.field4561.field4568 < arg1.field4561.field4568 ? -1 : (arg0.field4561.field4568 == arg1.field4561.field4568 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method6771((class397) arg0, (class397) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
