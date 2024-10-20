package deob;

import java.util.Comparator;

@ObfuscatedName("kj")
public abstract class class290 implements Comparator {

    @ObfuscatedName("kj.s")
    public Comparator field3698;

    @ObfuscatedName("kj.m(Ljava/util/Comparator;I)V")
    public final void method5126(Comparator arg0) {
        if (this.field3698 == null) {
            this.field3698 = arg0;
        } else if (this.field3698 instanceof class290) {
            ((class290) this.field3698).method5126(arg0);
        }
    }

    @ObfuscatedName("kj.q(Lkn;Lkn;B)I")
    public final int method5117(class289 arg0, class289 arg1) {
        return this.field3698 == null ? 0 : this.field3698.compare(arg0, arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
