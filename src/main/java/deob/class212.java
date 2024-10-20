package deob;

import java.util.Comparator;

@ObfuscatedName("hf")
public final class class212 implements Comparator {

    @ObfuscatedName("hf.j(Lgs;Lgs;I)I")
    public int method3615(class208 arg0, class208 arg1) {
        return arg0.field3073 < arg1.field3073 ? -1 : (arg0.field3073 == arg1.field3073 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3615((class208) arg0, (class208) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
