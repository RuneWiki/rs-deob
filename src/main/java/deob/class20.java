package deob;

import java.util.Comparator;

@ObfuscatedName("p")
public final class class20 implements Comparator {

    @ObfuscatedName("p.i(Lv;Lv;S)I")
    public int method148(class15 arg0, class15 arg1) {
        return arg0.field296 < arg1.field296 ? -1 : (arg0.field296 == arg1.field296 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method148((class15) arg0, (class15) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
