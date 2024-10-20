package deob;

import java.util.Comparator;

@ObfuscatedName("lc")
public abstract class class338 implements Comparator {

    @ObfuscatedName("lc.c")
    public Comparator field3950;

    @ObfuscatedName("lc.l(Ljava/util/Comparator;I)V")
    public final void method5475(Comparator arg0) {
        if (this.field3950 == null) {
            this.field3950 = arg0;
        } else if (this.field3950 instanceof class338) {
            ((class338) this.field3950).method5475(arg0);
        }
    }

    @ObfuscatedName("lc.y(Lle;Lle;S)I")
    public final int method5476(class337 arg0, class337 arg1) {
        return this.field3950 == null ? 0 : this.field3950.compare(arg0, arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
