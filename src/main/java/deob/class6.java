package deob;

import java.util.Comparator;

@ObfuscatedName("r")
public final class class6 implements Comparator {

    @ObfuscatedName("r.y(Ln;Ln;I)I")
    public int method58(class3 arg0, class3 arg1) {
        return arg0.field16.field34 < arg1.field16.field34 ? -1 : (arg0.field16.field34 == arg1.field16.field34 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method58((class3) arg0, (class3) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
