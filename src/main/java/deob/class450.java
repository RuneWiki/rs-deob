package deob;

import java.util.Comparator;

@ObfuscatedName("rd")
public abstract class class450 implements Comparator {

    @ObfuscatedName("rd.ap")
    public Comparator field4730;

    @ObfuscatedName("rd.ae(Ljava/util/Comparator;I)V")
    public final void method7557(Comparator arg0) {
        if (this.field4730 == null) {
            this.field4730 = arg0;
        } else if (this.field4730 instanceof class450) {
            ((class450) this.field4730).method7557(arg0);
        }
    }

    @ObfuscatedName("rd.aa(Lrq;Lrq;I)I")
    public final int method7558(class449 arg0, class449 arg1) {
        return this.field4730 == null ? 0 : this.field4730.compare(arg0, arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
