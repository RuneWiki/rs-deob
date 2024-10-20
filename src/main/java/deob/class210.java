package deob;

import java.util.Comparator;

@ObfuscatedName("hc")
public final class class210 implements Comparator {

    @ObfuscatedName("hc.n(Lgk;Lgk;B)I")
    public int method3599(class205 arg0, class205 arg1) {
        return arg0.field3052 < arg1.field3052 ? -1 : (arg0.field3052 == arg1.field3052 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3599((class205) arg0, (class205) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
