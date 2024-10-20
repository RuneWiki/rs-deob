package deob;

import java.util.Comparator;

@ObfuscatedName("kr")
public final class class295 implements Comparator {

    @ObfuscatedName("kr.i(Lkt;Lkt;I)I")
    public int method4855(class298 arg0, class298 arg1) {
        return arg0.field3746 < arg1.field3746 ? -1 : (arg0.field3746 == arg1.field3746 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method4855((class298) arg0, (class298) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
