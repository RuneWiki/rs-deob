package deob;

import java.util.Comparator;

@ObfuscatedName("nz")
public abstract class class372 implements Comparator {

    @ObfuscatedName("nz.c")
    public Comparator field4257;

    @ObfuscatedName("nz.q(Ljava/util/Comparator;B)V")
    public final void method6122(Comparator arg0) {
        if (this.field4257 == null) {
            this.field4257 = arg0;
        } else if (this.field4257 instanceof class372) {
            ((class372) this.field4257).method6122(arg0);
        }
    }

    @ObfuscatedName("nz.o(Lnn;Lnn;I)I")
    public final int method6118(class371 arg0, class371 arg1) {
        return this.field4257 == null ? 0 : this.field4257.compare(arg0, arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
