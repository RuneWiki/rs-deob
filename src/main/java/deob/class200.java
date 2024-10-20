package deob;

import java.util.Comparator;

@ObfuscatedName("gc")
public final class class200 implements Comparator {

    @ObfuscatedName("gc.v(Lgj;Lgj;B)I")
    public int method3438(class197 arg0, class197 arg1) {
        return arg0.field2944.field2965 < arg1.field2944.field2965 ? -1 : (arg0.field2944.field2965 == arg1.field2944.field2965 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3438((class197) arg0, (class197) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
