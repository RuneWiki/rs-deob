package deob;

import java.util.Comparator;

@ObfuscatedName("j")
public final class class4 implements Comparator {

    @ObfuscatedName("j.c(Lm;Lm;I)I")
    public int method33(class3 arg0, class3 arg1) {
        return arg0.field17.field29 < arg1.field17.field29 ? -1 : (arg0.field17.field29 == arg1.field17.field29 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method33((class3) arg0, (class3) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
