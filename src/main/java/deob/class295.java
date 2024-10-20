package deob;

import java.util.Comparator;

@ObfuscatedName("ko")
public final class class295 implements Comparator {

    @ObfuscatedName("ko.l(Lkd;Lkd;I)I")
    public int method4906(class298 arg0, class298 arg1) {
        return arg0.field3760 < arg1.field3760 ? -1 : (arg0.field3760 == arg1.field3760 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method4906((class298) arg0, (class298) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
