package deob;

import java.util.Comparator;

@ObfuscatedName("hp")
public final class class213 implements Comparator {

    @ObfuscatedName("hp.j(Lgs;Lgs;I)I")
    public int method3629(class208 arg0, class208 arg1) {
        return arg0.field3075 < arg1.field3075 ? -1 : (arg0.field3075 == arg1.field3075 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3629((class208) arg0, (class208) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
