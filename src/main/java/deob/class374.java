package deob;

import java.util.Comparator;

@ObfuscatedName("nx")
public abstract class class374 implements Comparator {

    @ObfuscatedName("nx.p")
    public Comparator field4354;

    @ObfuscatedName("nx.m(Ljava/util/Comparator;I)V")
    public final void method6244(Comparator arg0) {
        if (this.field4354 == null) {
            this.field4354 = arg0;
        } else if (this.field4354 instanceof class374) {
            ((class374) this.field4354).method6244(arg0);
        }
    }

    @ObfuscatedName("nx.x(Lnc;Lnc;B)I")
    public final int method6238(class373 arg0, class373 arg1) {
        return this.field4354 == null ? 0 : this.field4354.compare(arg0, arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
