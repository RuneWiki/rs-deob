package deob;

import java.util.Comparator;

@ObfuscatedName("p")
public final class class6 implements Comparator {

    @ObfuscatedName("p.d(Ln;Ln;I)I")
    public int method67(class3 arg0, class3 arg1) {
        return arg0.field22.field39 < arg1.field22.field39 ? -1 : (arg0.field22.field39 == arg1.field22.field39 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method67((class3) arg0, (class3) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
