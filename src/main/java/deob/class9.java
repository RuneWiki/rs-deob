package deob;

import java.util.Comparator;

@ObfuscatedName("q")
public final class class9 implements Comparator {

    @ObfuscatedName("q.a(Lm;Lm;I)I")
    public int method85(class8 arg0, class8 arg1) {
        return arg0.field51.field66 < arg1.field51.field66 ? -1 : (arg0.field51.field66 == arg1.field51.field66 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method85((class8) arg0, (class8) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
