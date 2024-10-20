package deob;

import java.util.Comparator;

@ObfuscatedName("hw")
public final class class222 implements Comparator {

    @ObfuscatedName("hw.s(Lhk;Lhk;B)I")
    public int method3746(class218 arg0, class218 arg1) {
        return arg0.field3199 < arg1.field3199 ? -1 : (arg0.field3199 == arg1.field3199 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3746((class218) arg0, (class218) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
