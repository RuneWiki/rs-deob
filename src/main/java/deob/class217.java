package deob;

import java.util.Comparator;

@ObfuscatedName("hk")
public final class class217 implements Comparator {

    @ObfuscatedName("hk.c(Lhm;Lhm;I)I")
    public int method3692(class214 arg0, class214 arg1) {
        return arg0.field3125.field3144 < arg1.field3125.field3144 ? -1 : (arg0.field3125.field3144 == arg1.field3125.field3144 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3692((class214) arg0, (class214) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
