package deob;

import java.util.Comparator;

@ObfuscatedName("hd")
public final class class216 implements Comparator {

    @ObfuscatedName("hd.i(Lhm;Lhm;I)I")
    public int method3670(class214 arg0, class214 arg1) {
        return arg0.field3133.field3155 < arg1.field3133.field3155 ? -1 : (arg0.field3133.field3155 == arg1.field3133.field3155 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3670((class214) arg0, (class214) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
