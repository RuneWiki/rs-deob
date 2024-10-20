package deob;

import java.util.Comparator;

@ObfuscatedName("g")
public final class class4 implements Comparator {

    @ObfuscatedName("g.o(Lb;Lb;I)I")
    public int method32(class3 arg0, class3 arg1) {
        return arg0.field20.field32 < arg1.field20.field32 ? -1 : (arg0.field20.field32 == arg1.field20.field32 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method32((class3) arg0, (class3) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
