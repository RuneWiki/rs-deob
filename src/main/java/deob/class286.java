package deob;

import java.util.Comparator;

@ObfuscatedName("jh")
public abstract class class286 implements Comparator {

    @ObfuscatedName("jh.v")
    public Comparator field3629;

    @ObfuscatedName("jh.l(Ljava/util/Comparator;I)V")
    public final void method4864(Comparator arg0) {
        if (this.field3629 == null) {
            this.field3629 = arg0;
        } else if (this.field3629 instanceof class286) {
            ((class286) this.field3629).method4864(arg0);
        }
    }

    @ObfuscatedName("jh.s(Ljn;Ljn;B)I")
    public final int method4862(class285 arg0, class285 arg1) {
        return this.field3629 == null ? 0 : this.field3629.compare(arg0, arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
