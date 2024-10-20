package deob;

import java.util.Comparator;

@ObfuscatedName("v")
public final class class6 implements Comparator {

    @ObfuscatedName("v.o(Lb;Lb;S)I")
    public int method58(class3 arg0, class3 arg1) {
        return arg0.field20.field31 < arg1.field20.field31 ? -1 : (arg0.field20.field31 == arg1.field20.field31 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method58((class3) arg0, (class3) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
