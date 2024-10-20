package deob;

import java.util.Comparator;

@ObfuscatedName("gz")
public final class class197 implements Comparator {

    @ObfuscatedName("gz.c(Lgb;Lgb;I)I")
    public int method3377(class195 arg0, class195 arg1) {
        return arg0.field2919.field2941 < arg1.field2919.field2941 ? -1 : (arg0.field2919.field2941 == arg1.field2919.field2941 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3377((class195) arg0, (class195) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
