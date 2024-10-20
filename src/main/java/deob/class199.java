package deob;

import java.util.Comparator;

@ObfuscatedName("gh")
public final class class199 implements Comparator {

    @ObfuscatedName("gh.e(Lgx;Lgx;B)I")
    public int method3378(class195 arg0, class195 arg1) {
        return arg0.field2923 < arg1.field2923 ? -1 : (arg0.field2923 == arg1.field2923 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3378((class195) arg0, (class195) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
