package deob;

import java.util.Comparator;

@ObfuscatedName("kh")
public final class class305 implements Comparator {

    @ObfuscatedName("kh.c(Lkj;Lkj;B)I")
    public int method5175(class310 arg0, class310 arg1) {
        return arg0.field3896.field3902 < arg1.field3896.field3902 ? -1 : (arg0.field3896.field3902 == arg1.field3896.field3902 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method5175((class310) arg0, (class310) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
