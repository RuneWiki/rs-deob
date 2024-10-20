package deob;

import java.util.Comparator;

@ObfuscatedName("ou")
public final class class383 implements Comparator {

    @ObfuscatedName("ou.aq(Loj;Loj;B)I")
    public int method6564(class386 arg0, class386 arg1) {
        return arg0.field4452 < arg1.field4452 ? -1 : (arg0.field4452 == arg1.field4452 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method6564((class386) arg0, (class386) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
