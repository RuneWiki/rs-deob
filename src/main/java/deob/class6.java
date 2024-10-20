package deob;

import java.util.Comparator;

@ObfuscatedName("q")
public final class class6 implements Comparator {

    @ObfuscatedName("q.z(Ls;Ls;B)I")
    public int method59(class3 arg0, class3 arg1) {
        return arg0.field18.field31 < arg1.field18.field31 ? -1 : (arg0.field18.field31 == arg1.field18.field31 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method59((class3) arg0, (class3) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
