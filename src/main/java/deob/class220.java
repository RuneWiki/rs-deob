package deob;

import java.util.Comparator;

@ObfuscatedName("hb")
public final class class220 implements Comparator {

    @ObfuscatedName("hb.s(Lhk;Lhk;B)I")
    public int method3730(class218 arg0, class218 arg1) {
        return arg0.field3203.field3219 < arg1.field3203.field3219 ? -1 : (arg0.field3203.field3219 == arg1.field3203.field3219 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3730((class218) arg0, (class218) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
