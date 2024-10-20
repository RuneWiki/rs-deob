package deob;

import java.util.Comparator;

@ObfuscatedName("ja")
public abstract class class276 implements Comparator {

    @ObfuscatedName("ja.w")
    public Comparator field3617;

    @ObfuscatedName("ja.c(Ljava/util/Comparator;I)V")
    public final void method4675(Comparator arg0) {
        if (this.field3617 == null) {
            this.field3617 = arg0;
        } else if (this.field3617 instanceof class276) {
            ((class276) this.field3617).method4675(arg0);
        }
    }

    @ObfuscatedName("ja.u(Ljd;Ljd;I)I")
    public final int method4676(class275 arg0, class275 arg1) {
        return this.field3617 == null ? 0 : this.field3617.compare(arg0, arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
