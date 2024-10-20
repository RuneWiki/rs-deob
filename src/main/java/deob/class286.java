package deob;

import java.util.Comparator;

@ObfuscatedName("jz")
public abstract class class286 implements Comparator {

    @ObfuscatedName("jz.b")
    public Comparator field3625;

    @ObfuscatedName("jz.u(Ljava/util/Comparator;I)V")
    public final void method4788(Comparator arg0) {
        if (this.field3625 == null) {
            this.field3625 = arg0;
        } else if (this.field3625 instanceof class286) {
            ((class286) this.field3625).method4788(arg0);
        }
    }

    @ObfuscatedName("jz.t(Ljh;Ljh;S)I")
    public final int method4793(class285 arg0, class285 arg1) {
        return this.field3625 == null ? 0 : this.field3625.compare(arg0, arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
