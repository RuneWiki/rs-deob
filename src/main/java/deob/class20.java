package deob;

import java.util.Comparator;

@ObfuscatedName("s")
public final class class20 implements Comparator {

    @ObfuscatedName("s.i(Lj;Lj;I)I")
    public int method120(class15 arg0, class15 arg1) {
        return arg0.field291 < arg1.field291 ? -1 : (arg0.field291 == arg1.field291 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method120((class15) arg0, (class15) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
