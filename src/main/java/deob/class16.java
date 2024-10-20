package deob;

import java.util.Comparator;

@ObfuscatedName("m")
public final class class16 implements Comparator {

    @ObfuscatedName("m.b(Lj;Lj;I)I")
    public int method84(class15 arg0, class15 arg1) {
        return arg0.field277.field284 < arg1.field277.field284 ? -1 : (arg0.field277.field284 == arg1.field277.field284 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method84((class15) arg0, (class15) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
