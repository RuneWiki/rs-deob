package deob;

import java.util.Comparator;

@ObfuscatedName("mz")
public abstract class class356 implements Comparator {

    @ObfuscatedName("mz.l")
    public Comparator field4162;

    @ObfuscatedName("mz.a(Ljava/util/Comparator;I)V")
    public final void method5778(Comparator arg0) {
        if (this.field4162 == null) {
            this.field4162 = arg0;
        } else if (this.field4162 instanceof class356) {
            ((class356) this.field4162).method5778(arg0);
        }
    }

    @ObfuscatedName("mz.y(Lmy;Lmy;S)I")
    public final int method5777(class355 arg0, class355 arg1) {
        return this.field4162 == null ? 0 : this.field4162.compare(arg0, arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
