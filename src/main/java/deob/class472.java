package deob;

import java.util.Comparator;

@ObfuscatedName("sg")
public abstract class class472 implements Comparator {

    @ObfuscatedName("sg.ad")
    public Comparator field4947;

    @ObfuscatedName("sg.aj(Ljava/util/Comparator;I)V")
    public final void method7856(Comparator arg0) {
        if (this.field4947 == null) {
            this.field4947 = arg0;
        } else if (this.field4947 instanceof class472) {
            ((class472) this.field4947).method7856(arg0);
        }
    }

    @ObfuscatedName("sg.av(Lsk;Lsk;I)I")
    public final int method7857(class471 arg0, class471 arg1) {
        return this.field4947 == null ? 0 : this.field4947.compare(arg0, arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
