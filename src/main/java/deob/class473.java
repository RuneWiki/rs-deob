package deob;

import java.util.Comparator;

@ObfuscatedName("sh")
public abstract class class473 implements Comparator {

    @ObfuscatedName("sh.ay")
    public Comparator field4923;

    @ObfuscatedName("sh.ad(Ljava/util/Comparator;I)V")
    public final void method7949(Comparator arg0) {
        if (this.field4923 == null) {
            this.field4923 = arg0;
        } else if (this.field4923 instanceof class473) {
            ((class473) this.field4923).method7949(arg0);
        }
    }

    @ObfuscatedName("sh.aq(Lsz;Lsz;B)I")
    public final int method7948(class472 arg0, class472 arg1) {
        return this.field4923 == null ? 0 : this.field4923.compare(arg0, arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
