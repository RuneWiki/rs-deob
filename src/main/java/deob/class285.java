package deob;

import java.util.Comparator;

@ObfuscatedName("js")
public abstract class class285 implements Comparator {

    @ObfuscatedName("js.m")
    public Comparator field3595;

    @ObfuscatedName("js.v(Ljava/util/Comparator;I)V")
    public final void method4714(Comparator arg0) {
        if (this.field3595 == null) {
            this.field3595 = arg0;
        } else if (this.field3595 instanceof class285) {
            ((class285) this.field3595).method4714(arg0);
        }
    }

    @ObfuscatedName("js.z(Ljd;Ljd;I)I")
    public final int method4715(class284 arg0, class284 arg1) {
        return this.field3595 == null ? 0 : this.field3595.compare(arg0, arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
