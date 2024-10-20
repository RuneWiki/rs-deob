package deob;

import java.util.Comparator;

@ObfuscatedName("hl")
public final class class218 implements Comparator {

    @ObfuscatedName("hl.h(Lhh;Lhh;I)I")
    public int method3771(class214 arg0, class214 arg1) {
        return arg0.field3125 < arg1.field3125 ? -1 : (arg0.field3125 == arg1.field3125 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3771((class214) arg0, (class214) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
