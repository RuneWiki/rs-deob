package deob;

import java.util.Comparator;

@ObfuscatedName("ly")
public final class class325 implements Comparator {

    @ObfuscatedName("ly.c(Llj;Llj;I)I")
    public int method5466(class323 arg0, class323 arg1) {
        return arg0.field4066.field4069 < arg1.field4066.field4069 ? -1 : (arg0.field4066.field4069 == arg1.field4066.field4069 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method5466((class323) arg0, (class323) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
