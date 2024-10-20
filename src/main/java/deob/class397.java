package deob;

import java.util.Comparator;

@ObfuscatedName("pc")
public final class class397 implements Comparator {

    @ObfuscatedName("pc.ap(Lpv;Lpv;I)I")
    public int method7128(class400 arg0, class400 arg1) {
        return arg0.field4661 < arg1.field4661 ? -1 : (arg0.field4661 == arg1.field4661 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method7128((class400) arg0, (class400) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
