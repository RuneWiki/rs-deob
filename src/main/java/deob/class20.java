package deob;

import java.util.Comparator;

@ObfuscatedName("w")
public final class class20 implements Comparator {

    @ObfuscatedName("w.b(Ls;Ls;I)I")
    public int method145(class15 arg0, class15 arg1) {
        return arg0.field270 < arg1.field270 ? -1 : (arg0.field270 == arg1.field270 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method145((class15) arg0, (class15) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
