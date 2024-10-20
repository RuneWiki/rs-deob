package deob;

import java.util.Comparator;

@ObfuscatedName("jj")
public final class class282 implements Comparator {

    @ObfuscatedName("jj.v(Ljs;Ljs;I)I")
    public int method4616(class283 arg0, class283 arg1) {
        return arg0.field3650 < arg1.field3650 ? -1 : (arg0.field3650 == arg1.field3650 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method4616((class283) arg0, (class283) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
