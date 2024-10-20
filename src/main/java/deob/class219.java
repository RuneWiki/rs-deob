package deob;

import java.util.Comparator;

@ObfuscatedName("hx")
public final class class219 implements Comparator {

    @ObfuscatedName("hx.c(Lhm;Lhm;B)I")
    public int method3705(class214 arg0, class214 arg1) {
        return arg0.field3123 < arg1.field3123 ? -1 : (arg0.field3123 == arg1.field3123 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3705((class214) arg0, (class214) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
