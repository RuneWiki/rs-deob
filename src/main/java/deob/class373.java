package deob;

import java.util.Comparator;

@ObfuscatedName("nf")
public abstract class class373 implements Comparator {

    @ObfuscatedName("nf.h")
    public Comparator field4313;

    @ObfuscatedName("nf.n(Ljava/util/Comparator;I)V")
    public final void method6009(Comparator arg0) {
        if (this.field4313 == null) {
            this.field4313 = arg0;
        } else if (this.field4313 instanceof class373) {
            ((class373) this.field4313).method6009(arg0);
        }
    }

    @ObfuscatedName("nf.d(Lnb;Lnb;B)I")
    public final int method6015(class372 arg0, class372 arg1) {
        return this.field4313 == null ? 0 : this.field4313.compare(arg0, arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
