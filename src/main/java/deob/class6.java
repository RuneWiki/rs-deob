package deob;

import java.util.Comparator;

@ObfuscatedName("w")
public final class class6 implements Comparator {

    @ObfuscatedName("w.f(Le;Le;I)I")
    public int method65(class3 arg0, class3 arg1) {
        return arg0.field16.field31 < arg1.field16.field31 ? -1 : (arg0.field16.field31 == arg1.field16.field31 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method65((class3) arg0, (class3) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
