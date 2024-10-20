package deob;

import java.util.Comparator;

@ObfuscatedName("hj")
public final class class219 implements Comparator {

    @ObfuscatedName("hj.b(Lhn;Lhn;B)I")
    public int method3707(class215 arg0, class215 arg1) {
        return arg0.field3152 < arg1.field3152 ? -1 : (arg0.field3152 == arg1.field3152 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3707((class215) arg0, (class215) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
