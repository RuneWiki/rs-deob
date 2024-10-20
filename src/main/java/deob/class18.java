package deob;

import java.util.Comparator;

@ObfuscatedName("y")
public final class class18 implements Comparator {

    @ObfuscatedName("y.s(Le;Le;B)I")
    public int method118(class15 arg0, class15 arg1) {
        return arg0.field305.field314 < arg1.field305.field314 ? -1 : (arg0.field305.field314 == arg1.field305.field314 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method118((class15) arg0, (class15) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
