package deob;

import java.util.Comparator;

@ObfuscatedName("hr")
public final class class217 implements Comparator {

    @ObfuscatedName("hr.f(Lho;Lho;I)I")
    public int method3716(class215 arg0, class215 arg1) {
        return arg0.field3148.field3173 < arg1.field3148.field3173 ? -1 : (arg0.field3148.field3173 == arg1.field3148.field3173 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3716((class215) arg0, (class215) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
