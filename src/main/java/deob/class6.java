package deob;

import java.util.Comparator;

@ObfuscatedName("h")
public final class class6 implements Comparator {

    @ObfuscatedName("h.b(Li;Li;I)I")
    public int method73(class3 arg0, class3 arg1) {
        return arg0.field18.field38 < arg1.field18.field38 ? -1 : (arg0.field18.field38 == arg1.field18.field38 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method73((class3) arg0, (class3) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
