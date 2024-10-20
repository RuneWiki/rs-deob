package deob;

import java.util.Comparator;

@ObfuscatedName("gj")
public final class class200 implements Comparator {

    @ObfuscatedName("gj.l(Lga;Lga;I)I")
    public int method3454(class195 arg0, class195 arg1) {
        return arg0.field2918 < arg1.field2918 ? -1 : (arg0.field2918 == arg1.field2918 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3454((class195) arg0, (class195) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
