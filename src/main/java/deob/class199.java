package deob;

import java.util.Comparator;

@ObfuscatedName("ge")
public final class class199 implements Comparator {

    @ObfuscatedName("ge.c(Lgb;Lgb;I)I")
    public int method3395(class195 arg0, class195 arg1) {
        return arg0.field2917 < arg1.field2917 ? -1 : (arg0.field2917 == arg1.field2917 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3395((class195) arg0, (class195) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
