package deob;

import java.util.Comparator;

@ObfuscatedName("jr")
public abstract class class275 implements Comparator {

    @ObfuscatedName("jr.t")
    public Comparator field3583;

    @ObfuscatedName("jr.d(Ljava/util/Comparator;B)V")
    public final void method4742(Comparator arg0) {
        if (this.field3583 == null) {
            this.field3583 = arg0;
        } else if (this.field3583 instanceof class275) {
            ((class275) this.field3583).method4742(arg0);
        }
    }

    @ObfuscatedName("jr.m(Ljg;Ljg;B)I")
    public final int method4741(class274 arg0, class274 arg1) {
        return this.field3583 == null ? 0 : this.field3583.compare(arg0, arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
