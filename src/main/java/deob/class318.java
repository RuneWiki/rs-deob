package deob;

import java.util.Comparator;

@ObfuscatedName("lv")
public final class class318 implements Comparator {

    @ObfuscatedName("lv.c(Llj;Llj;I)I")
    public int method5406(class323 arg0, class323 arg1) {
        return arg0.field4066.field4070 < arg1.field4066.field4070 ? -1 : (arg0.field4066.field4070 == arg1.field4066.field4070 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method5406((class323) arg0, (class323) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
