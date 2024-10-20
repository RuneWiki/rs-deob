package deob;

import java.util.Comparator;

@ObfuscatedName("w")
public final class class8 implements Comparator {

    @ObfuscatedName("w.g(Le;Le;I)I")
    public int method85(class3 arg0, class3 arg1) {
        return arg0.field17 < arg1.field17 ? -1 : (arg0.field17 == arg1.field17 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method85((class3) arg0, (class3) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
