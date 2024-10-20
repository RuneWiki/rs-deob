package deob;

import java.util.Comparator;

@ObfuscatedName("hh")
public final class class217 implements Comparator {

    @ObfuscatedName("hh.l(Lhk;Lhk;I)I")
    public int method3671(class214 arg0, class214 arg1) {
        return arg0.field3135.field3158 < arg1.field3135.field3158 ? -1 : (arg0.field3135.field3158 == arg1.field3135.field3158 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3671((class214) arg0, (class214) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
