package deob;

import java.util.Comparator;

@ObfuscatedName("si")
public abstract class class476 implements Comparator {

    @ObfuscatedName("si.aw")
    public Comparator field5010;

    @ObfuscatedName("si.au(Ljava/util/Comparator;I)V")
    public final void method8349(Comparator arg0) {
        if (this.field5010 == null) {
            this.field5010 = arg0;
        } else if (this.field5010 instanceof class476) {
            ((class476) this.field5010).method8349(arg0);
        }
    }

    @ObfuscatedName("si.an(Lse;Lse;I)I")
    public final int method8348(class475 arg0, class475 arg1) {
        return this.field5010 == null ? 0 : this.field5010.compare(arg0, arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
