package deob;

import java.util.Comparator;

@ObfuscatedName("q")
public final class class4 implements Comparator {

    @ObfuscatedName("q.p(Lx;Lx;I)I")
    public int method34(class3 arg0, class3 arg1) {
        return arg0.field19.field43 < arg1.field19.field43 ? -1 : (arg0.field19.field43 == arg1.field19.field43 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method34((class3) arg0, (class3) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
