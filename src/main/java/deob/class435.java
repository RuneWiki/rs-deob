package deob;

import java.util.Comparator;

@ObfuscatedName("qz")
public abstract class class435 implements Comparator {

    @ObfuscatedName("qz.ay")
    public Comparator field4658;

    @ObfuscatedName("qz.ag(Ljava/util/Comparator;I)V")
    public final void method7249(Comparator arg0) {
        if (this.field4658 == null) {
            this.field4658 = arg0;
        } else if (this.field4658 instanceof class435) {
            ((class435) this.field4658).method7249(arg0);
        }
    }

    @ObfuscatedName("qz.az(Lqe;Lqe;I)I")
    public final int method7250(class434 arg0, class434 arg1) {
        return this.field4658 == null ? 0 : this.field4658.compare(arg0, arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
