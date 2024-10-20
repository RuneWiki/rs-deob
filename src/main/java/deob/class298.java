package deob;

import java.util.Comparator;

@ObfuscatedName("kl")
public abstract class class298 implements Comparator {

    @ObfuscatedName("kl.e")
    public Comparator field3836;

    @ObfuscatedName("kl.c(Ljava/util/Comparator;I)V")
    public final void method4946(Comparator arg0) {
        if (this.field3836 == null) {
            this.field3836 = arg0;
        } else if (this.field3836 instanceof class298) {
            ((class298) this.field3836).method4946(arg0);
        }
    }

    @ObfuscatedName("kl.o(Lkg;Lkg;I)I")
    public final int method4947(class297 arg0, class297 arg1) {
        return this.field3836 == null ? 0 : this.field3836.compare(arg0, arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
