package deob;

import java.util.Comparator;

@ObfuscatedName("hq")
public final class class216 implements Comparator {

    @ObfuscatedName("hq.j(Lhg;Lhg;I)I")
    public int method3751(class214 arg0, class214 arg1) {
        return arg0.field3136.field3153 < arg1.field3136.field3153 ? -1 : (arg0.field3136.field3153 == arg1.field3136.field3153 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3751((class214) arg0, (class214) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
