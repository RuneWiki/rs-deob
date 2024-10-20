package deob;

import java.util.Comparator;

@ObfuscatedName("jm")
public abstract class class275 implements Comparator {

    @ObfuscatedName("jm.i")
    public Comparator field3572;

    @ObfuscatedName("jm.b(Ljava/util/Comparator;B)V")
    public final void method4704(Comparator arg0) {
        if (this.field3572 == null) {
            this.field3572 = arg0;
        } else if (this.field3572 instanceof class275) {
            ((class275) this.field3572).method4704(arg0);
        }
    }

    @ObfuscatedName("jm.e(Ljy;Ljy;I)I")
    public final int method4697(class274 arg0, class274 arg1) {
        return this.field3572 == null ? 0 : this.field3572.compare(arg0, arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
