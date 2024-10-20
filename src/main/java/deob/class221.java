package deob;

import java.util.Comparator;

@ObfuscatedName("hh")
public final class class221 implements Comparator {

    @ObfuscatedName("hh.a(Lhb;Lhb;I)I")
    public int method3781(class218 arg0, class218 arg1) {
        return arg0.field3203.field3220 < arg1.field3203.field3220 ? -1 : (arg0.field3203.field3220 == arg1.field3203.field3220 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3781((class218) arg0, (class218) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
