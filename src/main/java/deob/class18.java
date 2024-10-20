package deob;

import java.util.Comparator;

@ObfuscatedName("a")
public final class class18 implements Comparator {

    @ObfuscatedName("a.e(Ls;Ls;I)I")
    public int method111(class15 arg0, class15 arg1) {
        return arg0.field289.field305 < arg1.field289.field305 ? -1 : (arg0.field289.field305 == arg1.field289.field305 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method111((class15) arg0, (class15) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
