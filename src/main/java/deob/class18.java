package deob;

import java.util.Comparator;

@ObfuscatedName("v")
public final class class18 implements Comparator {

    @ObfuscatedName("v.j(Lr;Lr;B)I")
    public int method108(class15 arg0, class15 arg1) {
        return arg0.field292.field309 < arg1.field292.field309 ? -1 : (arg0.field292.field309 == arg1.field292.field309 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method108((class15) arg0, (class15) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
