package deob;

import java.util.Comparator;

@ObfuscatedName("jo")
public abstract class class286 implements Comparator {

    @ObfuscatedName("jo.r")
    public Comparator field3695;

    @ObfuscatedName("jo.d(Ljava/util/Comparator;I)V")
    public final void method5148(Comparator arg0) {
        if (this.field3695 == null) {
            this.field3695 = arg0;
        } else if (this.field3695 instanceof class286) {
            ((class286) this.field3695).method5148(arg0);
        }
    }

    @ObfuscatedName("jo.j(Ljr;Ljr;B)I")
    public final int method5152(class285 arg0, class285 arg1) {
        return this.field3695 == null ? 0 : this.field3695.compare(arg0, arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
