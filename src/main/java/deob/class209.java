package deob;

import java.util.Comparator;

@ObfuscatedName("hg")
public final class class209 implements Comparator {

    @ObfuscatedName("hg.e(Lgv;Lgv;B)I")
    public int method3531(class204 arg0, class204 arg1) {
        return arg0.field2998 < arg1.field2998 ? -1 : (arg0.field2998 == arg1.field2998 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3531((class204) arg0, (class204) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
