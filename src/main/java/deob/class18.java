package deob;

import java.util.Comparator;

@ObfuscatedName("f")
public final class class18 implements Comparator {

    @ObfuscatedName("f.n(Lx;Lx;B)I")
    public int method128(class17 arg0, class17 arg1) {
        return arg0.field84.field96 < arg1.field84.field96 ? -1 : (arg0.field84.field96 == arg1.field84.field96 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method128((class17) arg0, (class17) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
