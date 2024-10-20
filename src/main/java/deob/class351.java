package deob;

import java.util.Comparator;

@ObfuscatedName("mn")
public abstract class class351 implements Comparator {

    @ObfuscatedName("mn.b")
    public Comparator field4110;

    @ObfuscatedName("mn.j(Ljava/util/Comparator;I)V")
    public final void method5782(Comparator arg0) {
        if (this.field4110 == null) {
            this.field4110 = arg0;
        } else if (this.field4110 instanceof class351) {
            ((class351) this.field4110).method5782(arg0);
        }
    }

    @ObfuscatedName("mn.w(Lmv;Lmv;B)I")
    public final int method5785(class350 arg0, class350 arg1) {
        return this.field4110 == null ? 0 : this.field4110.compare(arg0, arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
