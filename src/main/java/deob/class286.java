package deob;

import java.util.Comparator;

@ObfuscatedName("jh")
public abstract class class286 implements Comparator {

    @ObfuscatedName("jh.h")
    public Comparator field3681;

    @ObfuscatedName("jh.m(Ljava/util/Comparator;I)V")
    public final void method4944(Comparator arg0) {
        if (this.field3681 == null) {
            this.field3681 = arg0;
        } else if (this.field3681 instanceof class286) {
            ((class286) this.field3681).method4944(arg0);
        }
    }

    @ObfuscatedName("jh.q(Ljw;Ljw;I)I")
    public final int method4946(class285 arg0, class285 arg1) {
        return this.field3681 == null ? 0 : this.field3681.compare(arg0, arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
