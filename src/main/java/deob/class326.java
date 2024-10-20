package deob;

import java.util.Comparator;

@ObfuscatedName("lp")
public final class class326 implements Comparator {

    @ObfuscatedName("lp.s(Llh;Llh;I)I")
    public int method5366(class324 arg0, class324 arg1) {
        return arg0.field4069.field4074 < arg1.field4069.field4074 ? -1 : (arg0.field4069.field4074 == arg1.field4069.field4074 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method5366((class324) arg0, (class324) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
