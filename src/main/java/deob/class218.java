package deob;

import java.util.Comparator;

@ObfuscatedName("hp")
public final class class218 implements Comparator {

    @ObfuscatedName("hp.f(Lho;Lho;I)I")
    public int method3730(class215 arg0, class215 arg1) {
        return arg0.field3148.field3170 < arg1.field3148.field3170 ? -1 : (arg0.field3148.field3170 == arg1.field3148.field3170 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3730((class215) arg0, (class215) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
