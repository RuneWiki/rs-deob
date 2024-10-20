package deob;

import java.util.Comparator;

@ObfuscatedName("ll")
public abstract class class322 implements Comparator {

    @ObfuscatedName("ll.o")
    public Comparator field3839;

    @ObfuscatedName("ll.n(Ljava/util/Comparator;I)V")
    public final void method5100(Comparator arg0) {
        if (this.field3839 == null) {
            this.field3839 = arg0;
        } else if (this.field3839 instanceof class322) {
            ((class322) this.field3839).method5100(arg0);
        }
    }

    @ObfuscatedName("ll.l(Llt;Llt;I)I")
    public final int method5101(class321 arg0, class321 arg1) {
        return this.field3839 == null ? 0 : this.field3839.compare(arg0, arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
