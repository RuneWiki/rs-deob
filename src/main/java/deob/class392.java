package deob;

import java.util.Comparator;

@ObfuscatedName("oc")
public abstract class class392 implements Comparator {

    @ObfuscatedName("oc.f")
    public Comparator field4485;

    @ObfuscatedName("oc.l(Ljava/util/Comparator;I)V")
    public final void method6744(Comparator arg0) {
        if (this.field4485 == null) {
            this.field4485 = arg0;
        } else if (this.field4485 instanceof class392) {
            ((class392) this.field4485).method6744(arg0);
        }
    }

    @ObfuscatedName("oc.s(Loj;Loj;I)I")
    public final int method6747(class391 arg0, class391 arg1) {
        return this.field4485 == null ? 0 : this.field4485.compare(arg0, arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
