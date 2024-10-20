package deob;

import java.util.Comparator;

@ObfuscatedName("lt")
public class class323 implements Comparator {

    @ObfuscatedName("lt.o")
    public final boolean field3940;

    public class323(boolean arg0) {
        this.field3940 = arg0;
    }

    @ObfuscatedName("lt.o(Lku;Lku;I)I")
    public int method5238(class297 arg0, class297 arg1) {
        return this.field3940 ? arg0.method4883().method5020(arg1.method4883()) : arg1.method4883().method5020(arg0.method4883());
    }

    public int compare(Object arg0, Object arg1) {
        return this.method5238((class297) arg0, (class297) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
