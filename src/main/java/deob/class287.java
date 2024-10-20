package deob;

import java.util.Comparator;

@ObfuscatedName("kf")
public abstract class class287 implements Comparator {

    @ObfuscatedName("kf.f")
    public Comparator field3685;

    @ObfuscatedName("kf.e(Ljava/util/Comparator;B)V")
    public final void method5010(Comparator arg0) {
        if (this.field3685 == null) {
            this.field3685 = arg0;
        } else if (this.field3685 instanceof class287) {
            ((class287) this.field3685).method5010(arg0);
        }
    }

    @ObfuscatedName("kf.x(Ljs;Ljs;I)I")
    public final int method5011(class286 arg0, class286 arg1) {
        return this.field3685 == null ? 0 : this.field3685.compare(arg0, arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
