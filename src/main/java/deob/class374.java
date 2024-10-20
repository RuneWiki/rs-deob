package deob;

import java.util.Comparator;

@ObfuscatedName("oq")
public final class class374 implements Comparator {

    @ObfuscatedName("oq.at(Log;Log;I)I")
    public int method6403(class379 arg0, class379 arg1) {
        return arg0.field4366.field4376 < arg1.field4366.field4376 ? -1 : (arg0.field4366.field4376 == arg1.field4366.field4376 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method6403((class379) arg0, (class379) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
