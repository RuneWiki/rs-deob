package deob;

import java.util.Comparator;

@ObfuscatedName("t")
public final class class20 implements Comparator {

    @ObfuscatedName("t.n(Ly;Ly;B)I")
    public int method152(class15 arg0, class15 arg1) {
        return arg0.field288 < arg1.field288 ? -1 : (arg0.field288 == arg1.field288 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method152((class15) arg0, (class15) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
