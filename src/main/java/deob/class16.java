package deob;

import java.util.Comparator;

@ObfuscatedName("m")
public final class class16 implements Comparator {

    @ObfuscatedName("m.c(Ll;Ll;I)I")
    public int method96(class15 arg0, class15 arg1) {
        return arg0.field275.field287 < arg1.field275.field287 ? -1 : (arg0.field275.field287 == arg1.field275.field287 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method96((class15) arg0, (class15) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
