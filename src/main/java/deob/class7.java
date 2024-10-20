package deob;

import java.util.Comparator;

@ObfuscatedName("u")
public final class class7 implements Comparator {

    @ObfuscatedName("u.x(Lc;Lc;B)I")
    public int method82(class3 arg0, class3 arg1) {
        return arg0.method24().compareTo(arg1.method24());
    }

    public int compare(Object arg0, Object arg1) {
        return this.method82((class3) arg0, (class3) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
