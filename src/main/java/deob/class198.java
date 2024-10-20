package deob;

import java.util.Comparator;

@ObfuscatedName("gw")
public final class class198 implements Comparator {

    @ObfuscatedName("gw.g(Lgi;Lgi;B)I")
    public int method3305(class195 arg0, class195 arg1) {
        return arg0.field2919.field2940 < arg1.field2919.field2940 ? -1 : (arg0.field2919.field2940 == arg1.field2919.field2940 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3305((class195) arg0, (class195) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
