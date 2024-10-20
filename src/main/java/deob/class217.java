package deob;

import java.util.Comparator;

@ObfuscatedName("hb")
public final class class217 implements Comparator {

    @ObfuscatedName("hb.w(Lhn;Lhn;B)I")
    public int method3721(class215 arg0, class215 arg1) {
        return arg0.field3157.field3175 < arg1.field3157.field3175 ? -1 : (arg0.field3157.field3175 == arg1.field3157.field3175 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3721((class215) arg0, (class215) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
