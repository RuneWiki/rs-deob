package deob;

import java.util.Comparator;

@ObfuscatedName("hg")
public final class class220 implements Comparator {

    @ObfuscatedName("hg.b(Lhn;Lhn;I)I")
    public int method3718(class215 arg0, class215 arg1) {
        return arg0.field3148 < arg1.field3148 ? -1 : (arg0.field3148 == arg1.field3148 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3718((class215) arg0, (class215) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
