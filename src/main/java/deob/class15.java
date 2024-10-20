package deob;

import java.util.Comparator;

@ObfuscatedName("i")
public final class class15 implements Comparator {

    @ObfuscatedName("i.h(La;La;I)I")
    public int method117(class17 arg0, class17 arg1) {
        return arg0.field69 < arg1.field69 ? -1 : (arg0.field69 == arg1.field69 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method117((class17) arg0, (class17) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
