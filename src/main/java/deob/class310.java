package deob;

import java.util.Comparator;

@ObfuscatedName("kl")
public final class class310 implements Comparator {

    @ObfuscatedName("kl.c(Lld;Lld;I)I")
    public int method5128(class315 arg0, class315 arg1) {
        return arg0.field3958.field3962 < arg1.field3958.field3962 ? -1 : (arg0.field3958.field3962 == arg1.field3958.field3962 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method5128((class315) arg0, (class315) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
