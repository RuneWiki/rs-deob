package deob;

import java.util.Comparator;

@ObfuscatedName("ln")
public abstract class class323 implements Comparator {

    @ObfuscatedName("ln.n")
    public Comparator field3839;

    @ObfuscatedName("ln.d(Ljava/util/Comparator;I)V")
    public final void method5237(Comparator arg0) {
        if (this.field3839 == null) {
            this.field3839 = arg0;
        } else if (this.field3839 instanceof class323) {
            ((class323) this.field3839).method5237(arg0);
        }
    }

    @ObfuscatedName("ln.s(Llx;Llx;B)I")
    public final int method5244(class322 arg0, class322 arg1) {
        return this.field3839 == null ? 0 : this.field3839.compare(arg0, arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
