package deob;

import java.util.Comparator;

@ObfuscatedName("l")
public final class class4 implements Comparator {

    @ObfuscatedName("l.z(Ls;Ls;I)I")
    public int method25(class3 arg0, class3 arg1) {
        return arg0.field18.field34 < arg1.field18.field34 ? -1 : (arg0.field18.field34 == arg1.field18.field34 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method25((class3) arg0, (class3) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
