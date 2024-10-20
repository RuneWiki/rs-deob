package deob;

import java.util.Comparator;

@ObfuscatedName("lp")
public final class class323 implements Comparator {

    @ObfuscatedName("lp.v(Llc;Llc;I)I")
    public int method5424(class324 arg0, class324 arg1) {
        return arg0.field4022 < arg1.field4022 ? -1 : (arg0.field4022 == arg1.field4022 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method5424((class324) arg0, (class324) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
