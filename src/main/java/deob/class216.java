package deob;

import java.util.Comparator;

@ObfuscatedName("hr")
public final class class216 implements Comparator {

    @ObfuscatedName("hr.d(Lhh;Lhh;I)I")
    public int method3760(class214 arg0, class214 arg1) {
        return arg0.field3132.field3152 < arg1.field3132.field3152 ? -1 : (arg0.field3132.field3152 == arg1.field3132.field3152 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3760((class214) arg0, (class214) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
