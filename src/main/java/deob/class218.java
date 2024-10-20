package deob;

import java.util.Comparator;

@ObfuscatedName("hd")
public final class class218 implements Comparator {

    @ObfuscatedName("hd.w(Lhn;Lhn;B)I")
    public int method3728(class215 arg0, class215 arg1) {
        return arg0.field3157.field3174 < arg1.field3157.field3174 ? -1 : (arg0.field3157.field3174 == arg1.field3157.field3174 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3728((class215) arg0, (class215) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
