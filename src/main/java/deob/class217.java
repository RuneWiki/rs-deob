package deob;

import java.util.Comparator;

@ObfuscatedName("hc")
public final class class217 implements Comparator {

    @ObfuscatedName("hc.d(Lhh;Lhh;I)I")
    public int method3770(class214 arg0, class214 arg1) {
        return arg0.field3132.field3154 < arg1.field3132.field3154 ? -1 : (arg0.field3132.field3154 == arg1.field3132.field3154 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3770((class214) arg0, (class214) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
