package deob;

import java.util.Comparator;

@ObfuscatedName("w")
public final class class9 implements Comparator {

    @ObfuscatedName("w.u(Ly;Ly;B)I")
    public int method74(class8 arg0, class8 arg1) {
        return arg0.field47.field64 < arg1.field47.field64 ? -1 : (arg0.field47.field64 == arg1.field47.field64 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method74((class8) arg0, (class8) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
