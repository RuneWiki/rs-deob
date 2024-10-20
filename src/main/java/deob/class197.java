package deob;

import java.util.Comparator;

@ObfuscatedName("gq")
public final class class197 implements Comparator {

    @ObfuscatedName("gq.x(Lgr;Lgr;I)I")
    public int method3412(class195 arg0, class195 arg1) {
        return arg0.field2910.field2939 < arg1.field2910.field2939 ? -1 : (arg0.field2910.field2939 == arg1.field2910.field2939 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3412((class195) arg0, (class195) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
