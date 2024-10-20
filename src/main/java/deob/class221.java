package deob;

import java.util.Comparator;

@ObfuscatedName("hu")
public final class class221 implements Comparator {

    @ObfuscatedName("hu.s(Lhk;Lhk;I)I")
    public int method3738(class218 arg0, class218 arg1) {
        return arg0.field3203.field3222 < arg1.field3203.field3222 ? -1 : (arg0.field3203.field3222 == arg1.field3203.field3222 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3738((class218) arg0, (class218) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
