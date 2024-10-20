package deob;

import java.util.Comparator;

@ObfuscatedName("od")
public final class class382 implements Comparator {

    @ObfuscatedName("od.az(Log;Log;I)I")
    public int method6451(class387 arg0, class387 arg1) {
        return arg0.field4481.field4491 < arg1.field4481.field4491 ? -1 : (arg0.field4481.field4491 == arg1.field4481.field4491 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method6451((class387) arg0, (class387) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
