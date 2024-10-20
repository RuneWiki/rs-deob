package deob;

import java.util.Comparator;

@ObfuscatedName("n")
public final class class6 implements Comparator {

    @ObfuscatedName("n.i(Lf;Lf;B)I")
    public int method60(class3 arg0, class3 arg1) {
        return arg0.field25.field38 < arg1.field25.field38 ? -1 : (arg0.field25.field38 == arg1.field25.field38 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method60((class3) arg0, (class3) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
