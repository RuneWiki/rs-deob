package deob;

import java.util.Comparator;

@ObfuscatedName("hm")
public final class class210 implements Comparator {

    @ObfuscatedName("hm.b(Lgk;Lgk;I)I")
    public int method3488(class205 arg0, class205 arg1) {
        return arg0.field3042 < arg1.field3042 ? -1 : (arg0.field3042 == arg1.field3042 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3488((class205) arg0, (class205) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
