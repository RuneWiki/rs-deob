package deob;

import java.util.Comparator;

@ObfuscatedName("kq")
public abstract class class298 implements Comparator {

    @ObfuscatedName("kq.z")
    public Comparator field3826;

    @ObfuscatedName("kq.x(Ljava/util/Comparator;B)V")
    public final void method4978(Comparator arg0) {
        if (this.field3826 == null) {
            this.field3826 = arg0;
        } else if (this.field3826 instanceof class298) {
            ((class298) this.field3826).method4978(arg0);
        }
    }

    @ObfuscatedName("kq.h(Lkm;Lkm;I)I")
    public final int method4977(class297 arg0, class297 arg1) {
        return this.field3826 == null ? 0 : this.field3826.compare(arg0, arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
