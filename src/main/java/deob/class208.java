package deob;

import java.util.Comparator;

@ObfuscatedName("gw")
public final class class208 implements Comparator {

    @ObfuscatedName("gw.b(Lgk;Lgk;B)I")
    public int method3475(class205 arg0, class205 arg1) {
        return arg0.field3041.field3067 < arg1.field3041.field3067 ? -1 : (arg0.field3041.field3067 == arg1.field3041.field3067 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3475((class205) arg0, (class205) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
