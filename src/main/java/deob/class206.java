package deob;

import java.util.Comparator;

@ObfuscatedName("gc")
public final class class206 implements Comparator {

    @ObfuscatedName("gc.e(Lgv;Lgv;I)I")
    public int method3505(class204 arg0, class204 arg1) {
        return arg0.field3000.field3029 < arg1.field3000.field3029 ? -1 : (arg0.field3000.field3029 == arg1.field3000.field3029 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3505((class204) arg0, (class204) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
