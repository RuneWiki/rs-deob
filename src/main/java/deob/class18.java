package deob;

import java.util.Comparator;

@ObfuscatedName("m")
public final class class18 implements Comparator {

    @ObfuscatedName("m.b(Ls;Ls;I)I")
    public int method112(class15 arg0, class15 arg1) {
        return arg0.field272.field292 < arg1.field272.field292 ? -1 : (arg0.field272.field292 == arg1.field272.field292 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method112((class15) arg0, (class15) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
