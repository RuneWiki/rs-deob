package deob;

import java.util.Comparator;

@ObfuscatedName("gw")
public final class class207 implements Comparator {

    @ObfuscatedName("gw.n(Lgk;Lgk;I)I")
    public int method3577(class205 arg0, class205 arg1) {
        return arg0.field3053.field3070 < arg1.field3053.field3070 ? -1 : (arg0.field3053.field3070 == arg1.field3053.field3070 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3577((class205) arg0, (class205) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
