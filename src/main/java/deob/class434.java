package deob;

import java.util.Comparator;

@ObfuscatedName("qz")
public abstract class class434 implements Comparator {

    @ObfuscatedName("qz.ae")
    public Comparator field4660;

    @ObfuscatedName("qz.aa(Ljava/util/Comparator;I)V")
    public final void method7261(Comparator arg0) {
        if (this.field4660 == null) {
            this.field4660 = arg0;
        } else if (this.field4660 instanceof class434) {
            ((class434) this.field4660).method7261(arg0);
        }
    }

    @ObfuscatedName("qz.af(Lqs;Lqs;I)I")
    public final int method7262(class433 arg0, class433 arg1) {
        return this.field4660 == null ? 0 : this.field4660.compare(arg0, arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
