package deob;

import java.util.Comparator;

@ObfuscatedName("ky")
public abstract class class298 implements Comparator {

    @ObfuscatedName("ky.q")
    public Comparator field3828;

    @ObfuscatedName("ky.x(Ljava/util/Comparator;I)V")
    public final void method4882(Comparator arg0) {
        if (this.field3828 == null) {
            this.field3828 = arg0;
        } else if (this.field3828 instanceof class298) {
            ((class298) this.field3828).method4882(arg0);
        }
    }

    @ObfuscatedName("ky.p(Lkv;Lkv;B)I")
    public final int method4883(class297 arg0, class297 arg1) {
        return this.field3828 == null ? 0 : this.field3828.compare(arg0, arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
