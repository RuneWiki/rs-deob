package deob;

import java.util.Comparator;

@ObfuscatedName("hj")
public final class class222 implements Comparator {

    @ObfuscatedName("hj.a(Lhb;Lhb;I)I")
    public int method3789(class218 arg0, class218 arg1) {
        return arg0.field3204 < arg1.field3204 ? -1 : (arg0.field3204 == arg1.field3204 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3789((class218) arg0, (class218) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
