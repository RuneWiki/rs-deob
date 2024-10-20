package deob;

import java.util.Comparator;

@ObfuscatedName("hh")
public final class class219 implements Comparator {

    @ObfuscatedName("hh.i(Lhk;Lhk;I)I")
    public int method3685(class214 arg0, class214 arg1) {
        return arg0.field3129 < arg1.field3129 ? -1 : (arg0.field3129 == arg1.field3129 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3685((class214) arg0, (class214) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
