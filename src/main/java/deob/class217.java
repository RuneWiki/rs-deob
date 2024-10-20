package deob;

import java.util.Comparator;

@ObfuscatedName("hc")
public final class class217 implements Comparator {

    @ObfuscatedName("hc.j(Lhg;Lhg;I)I")
    public int method3753(class214 arg0, class214 arg1) {
        return arg0.field3136.field3152 < arg1.field3136.field3152 ? -1 : (arg0.field3136.field3152 == arg1.field3136.field3152 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3753((class214) arg0, (class214) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
