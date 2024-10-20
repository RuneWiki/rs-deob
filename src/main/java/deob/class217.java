package deob;

import java.util.Comparator;

@ObfuscatedName("hp")
public final class class217 implements Comparator {

    @ObfuscatedName("hp.t(Lhw;Lhw;B)I")
    public int method3637(class215 arg0, class215 arg1) {
        return arg0.field3158.field3175 < arg1.field3158.field3175 ? -1 : (arg0.field3158.field3175 == arg1.field3158.field3175 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3637((class215) arg0, (class215) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
