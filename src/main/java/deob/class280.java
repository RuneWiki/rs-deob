package deob;

import java.util.Comparator;

@ObfuscatedName("jt")
public final class class280 implements Comparator {

    @ObfuscatedName("jt.v(Ljs;Ljs;I)I")
    public int method4605(class283 arg0, class283 arg1) {
        return arg0.field3648 < arg1.field3648 ? -1 : (arg0.field3648 == arg1.field3648 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method4605((class283) arg0, (class283) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
