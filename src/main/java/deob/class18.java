package deob;

import java.util.Comparator;

@ObfuscatedName("u")
public final class class18 implements Comparator {

    @ObfuscatedName("u.m(Lk;Lk;I)I")
    public int method122(class15 arg0, class15 arg1) {
        return arg0.field286.field300 < arg1.field286.field300 ? -1 : (arg0.field286.field300 == arg1.field286.field300 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method122((class15) arg0, (class15) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
