package deob;

import java.util.Comparator;

@ObfuscatedName("om")
public final class class378 implements Comparator {

    @ObfuscatedName("om.at(Log;Log;I)I")
    public int method6437(class379 arg0, class379 arg1) {
        return arg0.field4367 < arg1.field4367 ? -1 : (arg0.field4367 == arg1.field4367 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method6437((class379) arg0, (class379) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
