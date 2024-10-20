package deob;

import java.util.Comparator;

@ObfuscatedName("f")
public final class class18 implements Comparator {

    @ObfuscatedName("f.i(Lc;Lc;I)I")
    public int method115(class15 arg0, class15 arg1) {
        return arg0.field286.field306 < arg1.field286.field306 ? -1 : (arg0.field286.field306 == arg1.field286.field306 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method115((class15) arg0, (class15) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
