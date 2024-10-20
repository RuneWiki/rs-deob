package deob;

import java.util.Comparator;

@ObfuscatedName("f")
public final class class18 implements Comparator {

    @ObfuscatedName("f.d(Lu;Lu;B)I")
    public int method111(class15 arg0, class15 arg1) {
        return arg0.field291.field306 < arg1.field291.field306 ? -1 : (arg0.field291.field306 == arg1.field291.field306 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method111((class15) arg0, (class15) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
