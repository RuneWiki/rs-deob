package deob;

import java.util.Comparator;

@ObfuscatedName("jr")
public abstract class class286 implements Comparator {

    @ObfuscatedName("jr.v")
    public Comparator field3633;

    @ObfuscatedName("jr.p(Ljava/util/Comparator;I)V")
    public final void method4709(Comparator arg0) {
        if (this.field3633 == null) {
            this.field3633 = arg0;
        } else if (this.field3633 instanceof class286) {
            ((class286) this.field3633).method4709(arg0);
        }
    }

    @ObfuscatedName("jr.l(Lju;Lju;I)I")
    public final int method4712(class285 arg0, class285 arg1) {
        return this.field3633 == null ? 0 : this.field3633.compare(arg0, arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
