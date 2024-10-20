package deob;

import java.util.Comparator;

@ObfuscatedName("gw")
public final class class200 implements Comparator {

    @ObfuscatedName("gw.x(Lgr;Lgr;B)I")
    public int method3437(class195 arg0, class195 arg1) {
        return arg0.field2908 < arg1.field2908 ? -1 : (arg0.field2908 == arg1.field2908 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3437((class195) arg0, (class195) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
