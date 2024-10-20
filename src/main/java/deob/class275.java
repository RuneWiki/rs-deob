package deob;

import java.util.Comparator;

@ObfuscatedName("jr")
public abstract class class275 implements Comparator {

    @ObfuscatedName("jr.n")
    public Comparator field3581;

    @ObfuscatedName("jr.m(Ljava/util/Comparator;B)V")
    public final void method4588(Comparator arg0) {
        if (this.field3581 == null) {
            this.field3581 = arg0;
        } else if (this.field3581 instanceof class275) {
            ((class275) this.field3581).method4588(arg0);
        }
    }

    @ObfuscatedName("jr.y(Ljh;Ljh;B)I")
    public final int method4596(class274 arg0, class274 arg1) {
        return this.field3581 == null ? 0 : this.field3581.compare(arg0, arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
