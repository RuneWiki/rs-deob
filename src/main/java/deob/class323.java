package deob;

import java.util.Comparator;

@ObfuscatedName("lp")
public class class323 implements Comparator {

    @ObfuscatedName("lp.g")
    public final boolean field3943;

    public class323(boolean arg0) {
        this.field3943 = arg0;
    }

    @ObfuscatedName("lp.g(Lkg;Lkg;I)I")
    public int method5314(class297 arg0, class297 arg1) {
        return this.field3943 ? arg0.method4928().method5062(arg1.method4928()) : arg1.method4928().method5062(arg0.method4928());
    }

    public int compare(Object arg0, Object arg1) {
        return this.method5314((class297) arg0, (class297) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
