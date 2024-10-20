package deob;

import java.util.Comparator;

@ObfuscatedName("s")
public final class class18 implements Comparator {

    @ObfuscatedName("s.n(Ly;Ly;I)I")
    public int method127(class15 arg0, class15 arg1) {
        return arg0.field289.field309 < arg1.field289.field309 ? -1 : (arg0.field289.field309 == arg1.field289.field309 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method127((class15) arg0, (class15) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
