package deob;

import java.util.Comparator;

@ObfuscatedName("m")
public final class class8 implements Comparator {

    @ObfuscatedName("m.x(Lg;Lg;I)I")
    public int method94(class3 arg0, class3 arg1) {
        return arg0.field12 < arg1.field12 ? -1 : (arg0.field12 == arg1.field12 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method94((class3) arg0, (class3) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
