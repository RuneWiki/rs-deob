package deob;

import java.util.Comparator;

@ObfuscatedName("kc")
public final class class307 implements Comparator {

    @ObfuscatedName("kc.c(Lkj;Lkj;B)I")
    public int method5187(class310 arg0, class310 arg1) {
        return arg0.field3894 < arg1.field3894 ? -1 : (arg0.field3894 == arg1.field3894 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method5187((class310) arg0, (class310) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
