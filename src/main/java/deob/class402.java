package deob;

import java.util.Comparator;

@ObfuscatedName("ou")
public abstract class class402 implements Comparator {

    @ObfuscatedName("ou.w")
    public Comparator field4565;

    @ObfuscatedName("ou.k(Ljava/util/Comparator;B)V")
    public final void method7040(Comparator arg0) {
        if (this.field4565 == null) {
            this.field4565 = arg0;
        } else if (this.field4565 instanceof class402) {
            ((class402) this.field4565).method7040(arg0);
        }
    }

    @ObfuscatedName("ou.c(Low;Low;I)I")
    public final int method7039(class401 arg0, class401 arg1) {
        return this.field4565 == null ? 0 : this.field4565.compare(arg0, arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
