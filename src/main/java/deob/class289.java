package deob;

import java.util.Comparator;

@ObfuscatedName("kb")
public abstract class class289 implements Comparator {

    @ObfuscatedName("kb.h")
    public Comparator field3687;

    @ObfuscatedName("kb.v(Ljava/util/Comparator;I)V")
    public final void method5146(Comparator arg0) {
        if (this.field3687 == null) {
            this.field3687 = arg0;
        } else if (this.field3687 instanceof class289) {
            ((class289) this.field3687).method5146(arg0);
        }
    }

    @ObfuscatedName("kb.r(Lke;Lke;I)I")
    public final int method5147(class288 arg0, class288 arg1) {
        return this.field3687 == null ? 0 : this.field3687.compare(arg0, arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
