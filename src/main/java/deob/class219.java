package deob;

import java.util.Comparator;

@ObfuscatedName("hh")
public final class class219 implements Comparator {

    @ObfuscatedName("hh.f(Lho;Lho;S)I")
    public int method3733(class215 arg0, class215 arg1) {
        return arg0.field3149 < arg1.field3149 ? -1 : (arg0.field3149 == arg1.field3149 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3733((class215) arg0, (class215) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
