package deob;

import java.util.Comparator;

@ObfuscatedName("lq")
public final class class320 implements Comparator {

    @ObfuscatedName("lq.c(Llj;Llj;B)I")
    public int method5424(class323 arg0, class323 arg1) {
        return arg0.field4061 < arg1.field4061 ? -1 : (arg0.field4061 == arg1.field4061 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method5424((class323) arg0, (class323) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
