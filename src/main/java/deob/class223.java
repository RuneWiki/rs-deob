package deob;

import java.util.Comparator;

@ObfuscatedName("hq")
public final class class223 implements Comparator {

    @ObfuscatedName("hq.i(Lhl;Lhl;I)I")
    public int method3765(class218 arg0, class218 arg1) {
        return arg0.field3205 < arg1.field3205 ? -1 : (arg0.field3205 == arg1.field3205 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3765((class218) arg0, (class218) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
