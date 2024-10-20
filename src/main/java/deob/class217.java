package deob;

import java.util.Comparator;

@ObfuscatedName("hp")
public final class class217 implements Comparator {

    @ObfuscatedName("hp.a(Lhd;Lhd;I)I")
    public int method3780(class215 arg0, class215 arg1) {
        return arg0.field3154.field3173 < arg1.field3154.field3173 ? -1 : (arg0.field3154.field3173 == arg1.field3154.field3173 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3780((class215) arg0, (class215) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
