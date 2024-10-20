package deob;

import java.util.Comparator;

@ObfuscatedName("jm")
public abstract class class286 implements Comparator {

    @ObfuscatedName("jm.q")
    public Comparator field3662;

    @ObfuscatedName("jm.v(Ljava/util/Comparator;B)V")
    public final void method4950(Comparator arg0) {
        if (this.field3662 == null) {
            this.field3662 = arg0;
        } else if (this.field3662 instanceof class286) {
            ((class286) this.field3662).method4950(arg0);
        }
    }

    @ObfuscatedName("jm.p(Ljx;Ljx;I)I")
    public final int method4951(class285 arg0, class285 arg1) {
        return this.field3662 == null ? 0 : this.field3662.compare(arg0, arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
