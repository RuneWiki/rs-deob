package deob;

import java.util.Comparator;

@ObfuscatedName("j")
public final class class18 implements Comparator {

    @ObfuscatedName("j.g(Lp;Lp;B)I")
    public int method120(class15 arg0, class15 arg1) {
        return arg0.field289.field302 < arg1.field289.field302 ? -1 : (arg0.field289.field302 == arg1.field289.field302 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method120((class15) arg0, (class15) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
