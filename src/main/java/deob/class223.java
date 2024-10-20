package deob;

import java.util.Comparator;

@ObfuscatedName("hp")
public final class class223 implements Comparator {

    @ObfuscatedName("hp.l(Lha;Lha;I)I")
    public int method3887(class218 arg0, class218 arg1) {
        return arg0.field3209 < arg1.field3209 ? -1 : (arg0.field3209 == arg1.field3209 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3887((class218) arg0, (class218) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
