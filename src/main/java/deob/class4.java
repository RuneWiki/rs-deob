package deob;

import java.util.Comparator;

@ObfuscatedName("k")
public final class class4 implements Comparator {

    @ObfuscatedName("k.i(Lf;Lf;B)I")
    public int method28(class3 arg0, class3 arg1) {
        return arg0.field25.field39 < arg1.field25.field39 ? -1 : (arg0.field25.field39 == arg1.field25.field39 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method28((class3) arg0, (class3) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
