package deob;

import java.util.Comparator;

@ObfuscatedName("rn")
public abstract class class446 implements Comparator {

    @ObfuscatedName("rn.ah")
    public Comparator field4691;

    @ObfuscatedName("rn.az(Ljava/util/Comparator;I)V")
    public final void method7429(Comparator arg0) {
        if (this.field4691 == null) {
            this.field4691 = arg0;
        } else if (this.field4691 instanceof class446) {
            ((class446) this.field4691).method7429(arg0);
        }
    }

    @ObfuscatedName("rn.ap(Lrf;Lrf;I)I")
    public final int method7430(class445 arg0, class445 arg1) {
        return this.field4691 == null ? 0 : this.field4691.compare(arg0, arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
