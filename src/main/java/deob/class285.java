package deob;

import java.util.Comparator;

@ObfuscatedName("jk")
public abstract class class285 implements Comparator {

    @ObfuscatedName("jk.o")
    public Comparator field3627;

    @ObfuscatedName("jk.u(Ljava/util/Comparator;S)V")
    public final void method4798(Comparator arg0) {
        if (this.field3627 == null) {
            this.field3627 = arg0;
        } else if (this.field3627 instanceof class285) {
            ((class285) this.field3627).method4798(arg0);
        }
    }

    @ObfuscatedName("jk.a(Ljf;Ljf;I)I")
    public final int method4799(class284 arg0, class284 arg1) {
        return this.field3627 == null ? 0 : this.field3627.compare(arg0, arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
