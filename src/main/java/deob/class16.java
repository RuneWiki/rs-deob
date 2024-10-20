package deob;

import java.util.Comparator;

@ObfuscatedName("c")
public final class class16 implements Comparator {

    @ObfuscatedName("c.e(Ls;Ls;B)I")
    public int method77(class15 arg0, class15 arg1) {
        return arg0.field289.field306 < arg1.field289.field306 ? -1 : (arg0.field289.field306 == arg1.field289.field306 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method77((class15) arg0, (class15) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
