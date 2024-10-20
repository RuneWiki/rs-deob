package deob;

import java.util.Comparator;

@ObfuscatedName("gt")
public final class class200 implements Comparator {

    @ObfuscatedName("gt.e(Lgx;Lgx;B)I")
    public int method3384(class195 arg0, class195 arg1) {
        return arg0.field2926 < arg1.field2926 ? -1 : (arg0.field2926 == arg1.field2926 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3384((class195) arg0, (class195) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
