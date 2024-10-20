package deob;

import java.util.Comparator;

@ObfuscatedName("j")
public final class class9 implements Comparator {

    @ObfuscatedName("j.c(Ll;Ll;B)I")
    public int method78(class8 arg0, class8 arg1) {
        return arg0.field45.field58 < arg1.field45.field58 ? -1 : (arg0.field45.field58 == arg1.field45.field58 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method78((class8) arg0, (class8) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
