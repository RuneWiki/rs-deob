package deob;

import java.util.Comparator;

@ObfuscatedName("j")
public final class class16 implements Comparator {

    @ObfuscatedName("j.t(Lu;Lu;B)I")
    public int method81(class15 arg0, class15 arg1) {
        return arg0.field282.field294 < arg1.field282.field294 ? -1 : (arg0.field282.field294 == arg1.field282.field294 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method81((class15) arg0, (class15) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
