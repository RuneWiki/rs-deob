package deob;

import java.util.Comparator;

@ObfuscatedName("os")
public abstract class class395 implements Comparator {

    @ObfuscatedName("os.e")
    public Comparator field4532;

    @ObfuscatedName("os.b(Ljava/util/Comparator;I)V")
    public final void method6860(Comparator arg0) {
        if (this.field4532 == null) {
            this.field4532 = arg0;
        } else if (this.field4532 instanceof class395) {
            ((class395) this.field4532).method6860(arg0);
        }
    }

    @ObfuscatedName("os.j(Lov;Lov;I)I")
    public final int method6863(class394 arg0, class394 arg1) {
        return this.field4532 == null ? 0 : this.field4532.compare(arg0, arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
