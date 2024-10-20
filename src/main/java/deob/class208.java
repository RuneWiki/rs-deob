package deob;

import java.util.Comparator;

@ObfuscatedName("gk")
public final class class208 implements Comparator {

    @ObfuscatedName("gk.n(Lgy;Lgy;I)I")
    public int method3521(class205 arg0, class205 arg1) {
        return arg0.field3048.field3067 < arg1.field3048.field3067 ? -1 : (arg0.field3048.field3067 == arg1.field3048.field3067 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3521((class205) arg0, (class205) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
