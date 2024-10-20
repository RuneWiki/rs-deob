package deob;

import java.util.Comparator;

@ObfuscatedName("hh")
public final class class219 implements Comparator {

    @ObfuscatedName("hh.w(Lhn;Lhn;I)I")
    public int method3734(class215 arg0, class215 arg1) {
        return arg0.field3155 < arg1.field3155 ? -1 : (arg0.field3155 == arg1.field3155 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3734((class215) arg0, (class215) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
