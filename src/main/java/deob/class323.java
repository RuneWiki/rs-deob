package deob;

import java.util.Comparator;

@ObfuscatedName("lc")
public final class class323 implements Comparator {

    @ObfuscatedName("lc.s(Llh;Llh;I)I")
    public int method5335(class324 arg0, class324 arg1) {
        return arg0.field4068 < arg1.field4068 ? -1 : (arg0.field4068 == arg1.field4068 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method5335((class324) arg0, (class324) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
