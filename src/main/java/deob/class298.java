package deob;

import java.util.Comparator;

@ObfuscatedName("kr")
public abstract class class298 implements Comparator {

    @ObfuscatedName("kr.k")
    public Comparator field3833;

    @ObfuscatedName("kr.x(Ljava/util/Comparator;I)V")
    public final void method4895(Comparator arg0) {
        if (this.field3833 == null) {
            this.field3833 = arg0;
        } else if (this.field3833 instanceof class298) {
            ((class298) this.field3833).method4895(arg0);
        }
    }

    @ObfuscatedName("kr.y(Lku;Lku;B)I")
    public final int method4894(class297 arg0, class297 arg1) {
        return this.field3833 == null ? 0 : this.field3833.compare(arg0, arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
