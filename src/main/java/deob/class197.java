package deob;

import java.util.Comparator;

@ObfuscatedName("gg")
public final class class197 implements Comparator {

    @ObfuscatedName("gg.g(Lgi;Lgi;I)I")
    public int method3290(class195 arg0, class195 arg1) {
        return arg0.field2919.field2941 < arg1.field2919.field2941 ? -1 : (arg0.field2919.field2941 == arg1.field2919.field2941 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3290((class195) arg0, (class195) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
