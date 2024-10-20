package deob;

import java.util.Comparator;

@ObfuscatedName("f")
public final class class6 implements Comparator {

    @ObfuscatedName("f.a(Lm;Lm;I)I")
    public int method56(class8 arg0, class8 arg1) {
        return arg0.field56 < arg1.field56 ? -1 : (arg0.field56 == arg1.field56 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method56((class8) arg0, (class8) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
