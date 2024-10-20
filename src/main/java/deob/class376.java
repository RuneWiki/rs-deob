package deob;

import java.util.Comparator;

@ObfuscatedName("oa")
public final class class376 implements Comparator {

    @ObfuscatedName("oa.at(Log;Log;S)I")
    public int method6429(class379 arg0, class379 arg1) {
        return arg0.field4365 < arg1.field4365 ? -1 : (arg0.field4365 == arg1.field4365 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method6429((class379) arg0, (class379) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
