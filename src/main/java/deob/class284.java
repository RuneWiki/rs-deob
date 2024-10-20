package deob;

import java.util.Comparator;

@ObfuscatedName("jf")
public abstract class class284 implements Comparator {

    @ObfuscatedName("jf.w")
    public Comparator field3614;

    @ObfuscatedName("jf.p(Ljava/util/Comparator;I)V")
    public final void method4913(Comparator arg0) {
        if (this.field3614 == null) {
            this.field3614 = arg0;
        } else if (this.field3614 instanceof class284) {
            ((class284) this.field3614).method4913(arg0);
        }
    }

    @ObfuscatedName("jf.b(Ljx;Ljx;I)I")
    public final int method4914(class283 arg0, class283 arg1) {
        return this.field3614 == null ? 0 : this.field3614.compare(arg0, arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
