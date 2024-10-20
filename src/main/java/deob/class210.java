package deob;

import java.util.Comparator;

@ObfuscatedName("hc")
public final class class210 implements Comparator {

    @ObfuscatedName("hc.n(Lgg;Lgg;I)I")
    public int method3619(class205 arg0, class205 arg1) {
        return arg0.field3047 < arg1.field3047 ? -1 : (arg0.field3047 == arg1.field3047 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3619((class205) arg0, (class205) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
