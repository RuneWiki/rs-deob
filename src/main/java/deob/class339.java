package deob;

import java.util.Comparator;

@ObfuscatedName("ma")
public abstract class class339 implements Comparator {

    @ObfuscatedName("ma.w")
    public Comparator field3954;

    @ObfuscatedName("ma.e(Ljava/util/Comparator;B)V")
    public final void method5486(Comparator arg0) {
        if (this.field3954 == null) {
            this.field3954 = arg0;
        } else if (this.field3954 instanceof class339) {
            ((class339) this.field3954).method5486(arg0);
        }
    }

    @ObfuscatedName("ma.p(Lla;Lla;I)I")
    public final int method5491(class338 arg0, class338 arg1) {
        return this.field3954 == null ? 0 : this.field3954.compare(arg0, arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
