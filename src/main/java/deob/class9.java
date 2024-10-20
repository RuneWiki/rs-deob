package deob;

import java.util.Comparator;

@ObfuscatedName("e")
public final class class9 implements Comparator {

    @ObfuscatedName("e.m(Ll;Ll;I)I")
    public int method73(class8 arg0, class8 arg1) {
        return arg0.field41.field52 < arg1.field41.field52 ? -1 : (arg0.field41.field52 == arg1.field41.field52 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method73((class8) arg0, (class8) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
