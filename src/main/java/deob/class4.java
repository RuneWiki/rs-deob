package deob;

import java.util.Comparator;

@ObfuscatedName("d")
public final class class4 implements Comparator {

    @ObfuscatedName("d.x(Lc;Lc;I)I")
    public int method39(class3 arg0, class3 arg1) {
        return arg0.field26.field45 < arg1.field26.field45 ? -1 : (arg0.field26.field45 == arg1.field26.field45 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method39((class3) arg0, (class3) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
