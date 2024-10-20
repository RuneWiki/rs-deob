package deob;

import java.util.Comparator;

@ObfuscatedName("gg")
public final class class198 implements Comparator {

    @ObfuscatedName("gg.x(Lgr;Lgr;I)I")
    public int method3415(class195 arg0, class195 arg1) {
        return arg0.field2910.field2938 < arg1.field2910.field2938 ? -1 : (arg0.field2910.field2938 == arg1.field2910.field2938 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3415((class195) arg0, (class195) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
