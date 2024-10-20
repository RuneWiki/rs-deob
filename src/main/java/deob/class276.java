package deob;

import java.util.Comparator;

@ObfuscatedName("jx")
public abstract class class276 implements Comparator {

    @ObfuscatedName("jx.t")
    public Comparator field3585;

    @ObfuscatedName("jx.d(Ljava/util/Comparator;B)V")
    public final void method4713(Comparator arg0) {
        if (this.field3585 == null) {
            this.field3585 = arg0;
        } else if (this.field3585 instanceof class276) {
            ((class276) this.field3585).method4713(arg0);
        }
    }

    @ObfuscatedName("jx.l(Ljk;Ljk;I)I")
    public final int method4714(class275 arg0, class275 arg1) {
        return this.field3585 == null ? 0 : this.field3585.compare(arg0, arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
