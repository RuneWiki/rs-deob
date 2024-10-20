package deob;

import java.util.Comparator;

@ObfuscatedName("k")
public final class class6 implements Comparator {

    @ObfuscatedName("k.p(Lx;Lx;B)I")
    public int method80(class3 arg0, class3 arg1) {
        return arg0.field19.field42 < arg1.field19.field42 ? -1 : (arg0.field19.field42 == arg1.field19.field42 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method80((class3) arg0, (class3) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
