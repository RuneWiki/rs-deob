package deob;

import java.util.Comparator;

@ObfuscatedName("gd")
public final class class199 implements Comparator {

    @ObfuscatedName("gd.l(Lga;Lga;B)I")
    public int method3445(class195 arg0, class195 arg1) {
        return arg0.field2921 < arg1.field2921 ? -1 : (arg0.field2921 == arg1.field2921 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3445((class195) arg0, (class195) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
