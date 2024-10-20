package deob;

import java.util.Comparator;

@ObfuscatedName("ks")
public abstract class class298 implements Comparator {

    @ObfuscatedName("ks.i")
    public Comparator field3827;

    @ObfuscatedName("ks.w(Ljava/util/Comparator;I)V")
    public final void method4911(Comparator arg0) {
        if (this.field3827 == null) {
            this.field3827 = arg0;
        } else if (this.field3827 instanceof class298) {
            ((class298) this.field3827).method4911(arg0);
        }
    }

    @ObfuscatedName("ks.r(Lku;Lku;I)I")
    public final int method4912(class297 arg0, class297 arg1) {
        return this.field3827 == null ? 0 : this.field3827.compare(arg0, arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
