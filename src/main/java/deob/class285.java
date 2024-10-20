package deob;

import java.util.Comparator;

@ObfuscatedName("jn")
public abstract class class285 implements Comparator {

    @ObfuscatedName("jn.k")
    public Comparator field3614;

    @ObfuscatedName("jn.x(Ljava/util/Comparator;B)V")
    public final void method4782(Comparator arg0) {
        if (this.field3614 == null) {
            this.field3614 = arg0;
        } else if (this.field3614 instanceof class285) {
            ((class285) this.field3614).method4782(arg0);
        }
    }

    @ObfuscatedName("jn.w(Ljc;Ljc;I)I")
    public final int method4783(class284 arg0, class284 arg1) {
        return this.field3614 == null ? 0 : this.field3614.compare(arg0, arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
