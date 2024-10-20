package deob;

import java.util.Comparator;

@ObfuscatedName("b")
public final class class16 implements Comparator {

    @ObfuscatedName("b.d(Lu;Lu;I)I")
    public int method81(class15 arg0, class15 arg1) {
        return arg0.field280.field293 < arg1.field280.field293 ? -1 : (arg0.field280.field293 == arg1.field280.field293 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method81((class15) arg0, (class15) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
