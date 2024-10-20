package deob;

import java.util.Comparator;

@ObfuscatedName("hp")
public final class class219 implements Comparator {

    @ObfuscatedName("hp.m(Lhv;Lhv;I)I")
    public int method3781(class214 arg0, class214 arg1) {
        return arg0.field3126 < arg1.field3126 ? -1 : (arg0.field3126 == arg1.field3126 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3781((class214) arg0, (class214) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
