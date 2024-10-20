package deob;

import java.util.Comparator;

@ObfuscatedName("ha")
public final class class218 implements Comparator {

    @ObfuscatedName("ha.j(Lhg;Lhg;B)I")
    public int method3762(class214 arg0, class214 arg1) {
        return arg0.field3137 < arg1.field3137 ? -1 : (arg0.field3137 == arg1.field3137 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3762((class214) arg0, (class214) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
