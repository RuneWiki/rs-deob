package deob;

import java.util.Comparator;

@ObfuscatedName("ho")
public final class class217 implements Comparator {

    @ObfuscatedName("ho.b(Lhn;Lhn;B)I")
    public int method3692(class215 arg0, class215 arg1) {
        return arg0.field3149.field3176 < arg1.field3149.field3176 ? -1 : (arg0.field3149.field3176 == arg1.field3149.field3176 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3692((class215) arg0, (class215) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
