package deob;

import java.util.Comparator;

@ObfuscatedName("je")
public abstract class class275 implements Comparator {

    @ObfuscatedName("je.j")
    public Comparator field3574;

    @ObfuscatedName("je.t(Ljava/util/Comparator;B)V")
    public final void method4656(Comparator arg0) {
        if (this.field3574 == null) {
            this.field3574 = arg0;
        } else if (this.field3574 instanceof class275) {
            ((class275) this.field3574).method4656(arg0);
        }
    }

    @ObfuscatedName("je.q(Lju;Lju;I)I")
    public final int method4653(class274 arg0, class274 arg1) {
        return this.field3574 == null ? 0 : this.field3574.compare(arg0, arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
