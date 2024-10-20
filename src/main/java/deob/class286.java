package deob;

import java.util.Comparator;

@ObfuscatedName("jm")
public abstract class class286 implements Comparator {

    @ObfuscatedName("jm.l")
    public Comparator field3687;

    @ObfuscatedName("jm.r(Ljava/util/Comparator;I)V")
    public final void method5013(Comparator arg0) {
        if (this.field3687 == null) {
            this.field3687 = arg0;
        } else if (this.field3687 instanceof class286) {
            ((class286) this.field3687).method5013(arg0);
        }
    }

    @ObfuscatedName("jm.m(Ljb;Ljb;B)I")
    public final int method5014(class285 arg0, class285 arg1) {
        return this.field3687 == null ? 0 : this.field3687.compare(arg0, arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
