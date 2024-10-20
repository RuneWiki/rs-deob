package deob;

import java.util.Comparator;

@ObfuscatedName("jl")
public abstract class class284 implements Comparator {

    @ObfuscatedName("jl.m")
    public Comparator field3633;

    @ObfuscatedName("jl.l(Ljava/util/Comparator;B)V")
    public final void method4930(Comparator arg0) {
        if (this.field3633 == null) {
            this.field3633 = arg0;
        } else if (this.field3633 instanceof class284) {
            ((class284) this.field3633).method4930(arg0);
        }
    }

    @ObfuscatedName("jl.d(Ljn;Ljn;B)I")
    public final int method4931(class283 arg0, class283 arg1) {
        return this.field3633 == null ? 0 : this.field3633.compare(arg0, arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
