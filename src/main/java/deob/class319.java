package deob;

import java.util.Comparator;

@ObfuscatedName("lw")
public final class class319 implements Comparator {

    @ObfuscatedName("lw.v(Llc;Llc;I)I")
    public int method5394(class324 arg0, class324 arg1) {
        return arg0.field4023.field4033 < arg1.field4023.field4033 ? -1 : (arg0.field4023.field4033 == arg1.field4023.field4033 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method5394((class324) arg0, (class324) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
