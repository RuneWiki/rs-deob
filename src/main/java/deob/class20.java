package deob;

import java.util.Comparator;

@ObfuscatedName("j")
public final class class20 implements Comparator {

    @ObfuscatedName("j.z(Lf;Lf;I)I")
    public int method185(class17 arg0, class17 arg1) {
        return arg0.field76.field91 < arg1.field76.field91 ? -1 : (arg0.field76.field91 == arg1.field76.field91 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method185((class17) arg0, (class17) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
