package deob;

import java.util.Comparator;

@ObfuscatedName("gy")
public final class class207 implements Comparator {

    @ObfuscatedName("gy.e(Lgv;Lgv;I)I")
    public int method3513(class204 arg0, class204 arg1) {
        return arg0.field3000.field3026 < arg1.field3000.field3026 ? -1 : (arg0.field3000.field3026 == arg1.field3000.field3026 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3513((class204) arg0, (class204) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
