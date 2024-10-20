package deob;

import java.util.Comparator;

@ObfuscatedName("q")
public final class class16 implements Comparator {

    @ObfuscatedName("q.g(Lp;Lp;I)I")
    public int method81(class15 arg0, class15 arg1) {
        return arg0.field289.field303 < arg1.field289.field303 ? -1 : (arg0.field289.field303 == arg1.field289.field303 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method81((class15) arg0, (class15) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
