package deob;

import java.util.Comparator;

@ObfuscatedName("gx")
public final class class208 implements Comparator {

    @ObfuscatedName("gx.e(Lgv;Lgv;I)I")
    public int method3528(class204 arg0, class204 arg1) {
        return arg0.field3002 < arg1.field3002 ? -1 : (arg0.field3002 == arg1.field3002 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3528((class204) arg0, (class204) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
