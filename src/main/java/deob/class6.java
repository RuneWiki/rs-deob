package deob;

import java.util.Comparator;

@ObfuscatedName("n")
public final class class6 implements Comparator {

    @ObfuscatedName("n.s(Lq;Lq;I)I")
    public int method54(class8 arg0, class8 arg1) {
        return arg0.field54 < arg1.field54 ? -1 : (arg0.field54 == arg1.field54 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method54((class8) arg0, (class8) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
