package deob;

import java.util.Comparator;

@ObfuscatedName("i")
public final class class20 implements Comparator {

    @ObfuscatedName("i.s(Le;Le;I)I")
    public int method138(class15 arg0, class15 arg1) {
        return arg0.field295 < arg1.field295 ? -1 : (arg0.field295 == arg1.field295 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method138((class15) arg0, (class15) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
