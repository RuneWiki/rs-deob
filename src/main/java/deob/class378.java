package deob;

import java.util.Comparator;

@ObfuscatedName("ou")
public final class class378 implements Comparator {

    @ObfuscatedName("ou.am(Loo;Loo;S)I")
    public int method6522(class383 arg0, class383 arg1) {
        return arg0.field4422.field4428 < arg1.field4422.field4428 ? -1 : (arg0.field4422.field4428 == arg1.field4422.field4428 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method6522((class383) arg0, (class383) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
