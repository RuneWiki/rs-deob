package deob;

import java.util.Comparator;

@ObfuscatedName("lq")
public final class class317 implements Comparator {

    @ObfuscatedName("lq.c(Lld;Lld;B)I")
    public int method5195(class315 arg0, class315 arg1) {
        return arg0.field3958.field3961 < arg1.field3958.field3961 ? -1 : (arg0.field3958.field3961 == arg1.field3958.field3961 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method5195((class315) arg0, (class315) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
