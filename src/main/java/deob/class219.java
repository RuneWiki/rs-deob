package deob;

import java.util.Comparator;

@ObfuscatedName("hq")
public final class class219 implements Comparator {

    @ObfuscatedName("hq.v(Lhu;Lhu;B)I")
    public int method3721(class214 arg0, class214 arg1) {
        return arg0.field3142 < arg1.field3142 ? -1 : (arg0.field3142 == arg1.field3142 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3721((class214) arg0, (class214) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
