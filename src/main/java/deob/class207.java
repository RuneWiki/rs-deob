package deob;

import java.util.Comparator;

@ObfuscatedName("gw")
public final class class207 implements Comparator {

    @ObfuscatedName("gw.n(Lgy;Lgy;B)I")
    public int method3584(class205 arg0, class205 arg1) {
        return arg0.field3051.field3074 < arg1.field3051.field3074 ? -1 : (arg0.field3051.field3074 == arg1.field3051.field3074 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3584((class205) arg0, (class205) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
