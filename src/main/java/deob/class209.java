package deob;

import java.util.Comparator;

@ObfuscatedName("hk")
public final class class209 implements Comparator {

    @ObfuscatedName("hk.t(Lgn;Lgn;I)I")
    public int method3566(class205 arg0, class205 arg1) {
        return arg0.field3049 < arg1.field3049 ? -1 : (arg0.field3049 == arg1.field3049 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3566((class205) arg0, (class205) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
