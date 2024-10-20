package deob;

import java.util.Comparator;

@ObfuscatedName("j")
public final class class6 implements Comparator {

    @ObfuscatedName("j.k(Lo;Lo;B)I")
    public int method81(class3 arg0, class3 arg1) {
        return arg0.field23.field46 < arg1.field23.field46 ? -1 : (arg0.field23.field46 == arg1.field23.field46 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method81((class3) arg0, (class3) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
