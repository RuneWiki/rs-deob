package deob;

import java.util.Comparator;

@ObfuscatedName("rg")
public abstract class class454 implements Comparator {

    @ObfuscatedName("rg.ah")
    public Comparator field4793;

    @ObfuscatedName("rg.as(Ljava/util/Comparator;B)V")
    public final void method7449(Comparator arg0) {
        if (this.field4793 == null) {
            this.field4793 = arg0;
        } else if (this.field4793 instanceof class454) {
            ((class454) this.field4793).method7449(arg0);
        }
    }

    @ObfuscatedName("rg.ag(Lrr;Lrr;B)I")
    public final int method7450(class453 arg0, class453 arg1) {
        return this.field4793 == null ? 0 : this.field4793.compare(arg0, arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
