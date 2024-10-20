package deob;

import java.util.Comparator;

@ObfuscatedName("p")
public final class class8 implements Comparator {

    @ObfuscatedName("p.n(Lm;Lm;B)I")
    public int method94(class3 arg0, class3 arg1) {
        return arg0.field16 < arg1.field16 ? -1 : (arg0.field16 == arg1.field16 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method94((class3) arg0, (class3) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
