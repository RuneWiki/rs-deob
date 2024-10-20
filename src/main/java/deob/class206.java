package deob;

import java.util.Comparator;

@ObfuscatedName("gc")
public final class class206 implements Comparator {

    @ObfuscatedName("gc.q(Lgd;Lgd;I)I")
    public int method3438(class204 arg0, class204 arg1) {
        return arg0.field2991.field3025 < arg1.field2991.field3025 ? -1 : (arg0.field2991.field3025 == arg1.field2991.field3025 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3438((class204) arg0, (class204) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
