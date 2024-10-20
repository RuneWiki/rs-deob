package deob;

import java.util.Comparator;

@ObfuscatedName("gy")
public final class class208 implements Comparator {

    @ObfuscatedName("gy.q(Lgd;Lgd;I)I")
    public int method3448(class204 arg0, class204 arg1) {
        return arg0.field2992 < arg1.field2992 ? -1 : (arg0.field2992 == arg1.field2992 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3448((class204) arg0, (class204) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
