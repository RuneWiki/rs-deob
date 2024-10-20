package deob;

import java.util.Comparator;

@ObfuscatedName("rg")
public abstract class class453 implements Comparator {

    @ObfuscatedName("rg.aw")
    public Comparator field4761;

    @ObfuscatedName("rg.az(Ljava/util/Comparator;B)V")
    public final void method7577(Comparator arg0) {
        if (this.field4761 == null) {
            this.field4761 = arg0;
        } else if (this.field4761 instanceof class453) {
            ((class453) this.field4761).method7577(arg0);
        }
    }

    @ObfuscatedName("rg.ao(Lra;Lra;B)I")
    public final int method7579(class452 arg0, class452 arg1) {
        return this.field4761 == null ? 0 : this.field4761.compare(arg0, arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
