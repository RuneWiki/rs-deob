package deob;

import java.util.Comparator;

@ObfuscatedName("gz")
public final class class202 implements Comparator {

    @ObfuscatedName("gz.p(Lgp;Lgp;I)I")
    public int method3412(class197 arg0, class197 arg1) {
        return arg0.field2940 < arg1.field2940 ? -1 : (arg0.field2940 == arg1.field2940 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3412((class197) arg0, (class197) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
