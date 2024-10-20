package deob;

import java.util.Comparator;

@ObfuscatedName("hj")
public final class class222 implements Comparator {

    @ObfuscatedName("hj.i(Lhl;Lhl;I)I")
    public int method3758(class218 arg0, class218 arg1) {
        return arg0.field3208 < arg1.field3208 ? -1 : (arg0.field3208 == arg1.field3208 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3758((class218) arg0, (class218) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
