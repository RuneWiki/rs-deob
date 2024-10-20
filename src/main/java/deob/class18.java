package deob;

import java.util.Comparator;

@ObfuscatedName("q")
public final class class18 implements Comparator {

    @ObfuscatedName("q.o(Ll;Ll;I)I")
    public int method118(class15 arg0, class15 arg1) {
        return arg0.field292.field317 < arg1.field292.field317 ? -1 : (arg0.field292.field317 == arg1.field292.field317 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method118((class15) arg0, (class15) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
