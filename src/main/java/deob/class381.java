package deob;

import java.util.Comparator;

@ObfuscatedName("ob")
public final class class381 implements Comparator {

    @ObfuscatedName("ob.at(Log;Log;I)I")
    public int method6469(class379 arg0, class379 arg1) {
        return arg0.field4366.field4373 < arg1.field4366.field4373 ? -1 : (arg0.field4366.field4373 == arg1.field4366.field4373 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method6469((class379) arg0, (class379) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
