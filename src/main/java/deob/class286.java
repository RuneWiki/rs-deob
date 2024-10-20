package deob;

import java.util.Comparator;

@ObfuscatedName("jz")
public abstract class class286 implements Comparator {

    @ObfuscatedName("jz.c")
    public Comparator field3669;

    @ObfuscatedName("jz.s(Ljava/util/Comparator;S)V")
    public final void method4979(Comparator arg0) {
        if (this.field3669 == null) {
            this.field3669 = arg0;
        } else if (this.field3669 instanceof class286) {
            ((class286) this.field3669).method4979(arg0);
        }
    }

    @ObfuscatedName("jz.v(Ljd;Ljd;B)I")
    public final int method4980(class285 arg0, class285 arg1) {
        return this.field3669 == null ? 0 : this.field3669.compare(arg0, arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
