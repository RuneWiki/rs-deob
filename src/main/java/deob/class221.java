package deob;

import java.util.Comparator;

@ObfuscatedName("ha")
public final class class221 implements Comparator {

    @ObfuscatedName("ha.x(Lhu;Lhu;I)I")
    public int method3736(class218 arg0, class218 arg1) {
        return arg0.field3204.field3220 < arg1.field3204.field3220 ? -1 : (arg0.field3204.field3220 == arg1.field3204.field3220 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3736((class218) arg0, (class218) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
