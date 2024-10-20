package deob;

import java.util.Comparator;

@ObfuscatedName("gv")
public final class class200 implements Comparator {

    @ObfuscatedName("gv.p(Lgp;Lgp;B)I")
    public int method3400(class197 arg0, class197 arg1) {
        return arg0.field2942.field2961 < arg1.field2942.field2961 ? -1 : (arg0.field2942.field2961 == arg1.field2942.field2961 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3400((class197) arg0, (class197) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
