package deob;

import java.util.Comparator;

@ObfuscatedName("oz")
public final class class389 implements Comparator {

    @ObfuscatedName("oz.az(Log;Log;I)I")
    public int method6517(class387 arg0, class387 arg1) {
        return arg0.field4481.field4489 < arg1.field4481.field4489 ? -1 : (arg0.field4481.field4489 == arg1.field4481.field4489 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method6517((class387) arg0, (class387) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
