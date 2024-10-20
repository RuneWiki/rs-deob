package deob;

import java.util.Comparator;

@ObfuscatedName("gv")
public final class class200 implements Comparator {

    @ObfuscatedName("gv.a(Lgr;Lgr;I)I")
    public int method3404(class197 arg0, class197 arg1) {
        return arg0.field2938.field2959 < arg1.field2938.field2959 ? -1 : (arg0.field2938.field2959 == arg1.field2938.field2959 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3404((class197) arg0, (class197) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
