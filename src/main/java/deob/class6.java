package deob;

import java.util.Comparator;

@ObfuscatedName("j")
public final class class6 implements Comparator {

    @ObfuscatedName("j.b(Lc;Lc;I)I")
    public int method66(class3 arg0, class3 arg1) {
        return arg0.field25.field43 < arg1.field25.field43 ? -1 : (arg0.field25.field43 == arg1.field25.field43 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method66((class3) arg0, (class3) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
