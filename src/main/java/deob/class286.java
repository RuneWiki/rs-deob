package deob;

import java.util.Comparator;

@ObfuscatedName("jo")
public abstract class class286 implements Comparator {

    @ObfuscatedName("jo.s")
    public Comparator field3649;

    @ObfuscatedName("jo.w(Ljava/util/Comparator;S)V")
    public final void method4965(Comparator arg0) {
        if (this.field3649 == null) {
            this.field3649 = arg0;
        } else if (this.field3649 instanceof class286) {
            ((class286) this.field3649).method4965(arg0);
        }
    }

    @ObfuscatedName("jo.a(Ljx;Ljx;I)I")
    public final int method4967(class285 arg0, class285 arg1) {
        return this.field3649 == null ? 0 : this.field3649.compare(arg0, arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
