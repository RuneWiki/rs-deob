package deob;

import java.util.Comparator;

@ObfuscatedName("c")
public final class class20 implements Comparator {

    @ObfuscatedName("c.d(Lu;Lu;I)I")
    public int method127(class15 arg0, class15 arg1) {
        return arg0.field279 < arg1.field279 ? -1 : (arg0.field279 == arg1.field279 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method127((class15) arg0, (class15) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
