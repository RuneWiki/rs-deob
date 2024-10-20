package deob;

import java.util.Comparator;

@ObfuscatedName("i")
public final class class8 implements Comparator {

    @ObfuscatedName("i.z(Ls;Ls;I)I")
    public int method77(class3 arg0, class3 arg1) {
        return arg0.field21 < arg1.field21 ? -1 : (arg0.field21 == arg1.field21 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method77((class3) arg0, (class3) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
