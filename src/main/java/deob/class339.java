package deob;

import java.util.Comparator;

@ObfuscatedName("mv")
public abstract class class339 implements Comparator {

    @ObfuscatedName("mv.q")
    public Comparator field3962;

    @ObfuscatedName("mv.a(Ljava/util/Comparator;I)V")
    public final void method5524(Comparator arg0) {
        if (this.field3962 == null) {
            this.field3962 = arg0;
        } else if (this.field3962 instanceof class339) {
            ((class339) this.field3962).method5524(arg0);
        }
    }

    @ObfuscatedName("mv.e(Llu;Llu;I)I")
    public final int method5534(class338 arg0, class338 arg1) {
        return this.field3962 == null ? 0 : this.field3962.compare(arg0, arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
