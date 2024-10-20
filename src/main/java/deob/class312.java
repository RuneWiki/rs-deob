package deob;

import java.util.Comparator;

@ObfuscatedName("kk")
public final class class312 implements Comparator {

    @ObfuscatedName("kk.c(Lkj;Lkj;I)I")
    public int method5240(class310 arg0, class310 arg1) {
        return arg0.field3896.field3900 < arg1.field3896.field3900 ? -1 : (arg0.field3896.field3900 == arg1.field3896.field3900 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method5240((class310) arg0, (class310) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
