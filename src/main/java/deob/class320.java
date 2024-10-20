package deob;

import java.util.Comparator;

@ObfuscatedName("lo")
public final class class320 implements Comparator {

    @ObfuscatedName("lo.c(Lla;Lla;I)I")
    public int method5529(class325 arg0, class325 arg1) {
        return arg0.field4104.field4111 < arg1.field4104.field4111 ? -1 : (arg0.field4104.field4111 == arg1.field4104.field4111 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method5529((class325) arg0, (class325) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
