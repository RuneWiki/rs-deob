package deob;

import java.util.Comparator;

@ObfuscatedName("u")
public final class class18 implements Comparator {

    @ObfuscatedName("u.i(Lv;Lv;I)I")
    public int method124(class15 arg0, class15 arg1) {
        return arg0.field297.field309 < arg1.field297.field309 ? -1 : (arg0.field297.field309 == arg1.field297.field309 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method124((class15) arg0, (class15) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
