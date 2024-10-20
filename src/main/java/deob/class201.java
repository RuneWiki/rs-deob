package deob;

import java.util.Comparator;

@ObfuscatedName("gi")
public final class class201 implements Comparator {

    @ObfuscatedName("gi.b(Lgy;Lgy;B)I")
    public int method3455(class197 arg0, class197 arg1) {
        return arg0.field2934 < arg1.field2934 ? -1 : (arg0.field2934 == arg1.field2934 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3455((class197) arg0, (class197) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
