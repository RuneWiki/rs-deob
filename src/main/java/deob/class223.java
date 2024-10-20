package deob;

import java.util.Comparator;

@ObfuscatedName("hj")
public final class class223 implements Comparator {

    @ObfuscatedName("hj.f(Lhn;Lhn;I)I")
    public int method3809(class218 arg0, class218 arg1) {
        return arg0.field3197 < arg1.field3197 ? -1 : (arg0.field3197 == arg1.field3197 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3809((class218) arg0, (class218) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
