package deob;

import java.util.Comparator;

@ObfuscatedName("r")
public final class class16 implements Comparator {

    @ObfuscatedName("r.s(Le;Le;B)I")
    public int method85(class15 arg0, class15 arg1) {
        return arg0.field305.field315 < arg1.field305.field315 ? -1 : (arg0.field305.field315 == arg1.field305.field315 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method85((class15) arg0, (class15) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
