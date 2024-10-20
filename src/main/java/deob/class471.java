package deob;

import java.util.Comparator;

@ObfuscatedName("sc")
public abstract class class471 implements Comparator {

    @ObfuscatedName("sc.al")
    public Comparator field4923;

    @ObfuscatedName("sc.ao(Ljava/util/Comparator;I)V")
    public final void method7896(Comparator arg0) {
        if (this.field4923 == null) {
            this.field4923 = arg0;
        } else if (this.field4923 instanceof class471) {
            ((class471) this.field4923).method7896(arg0);
        }
    }

    @ObfuscatedName("sc.ah(Lsg;Lsg;I)I")
    public final int method7897(class470 arg0, class470 arg1) {
        return this.field4923 == null ? 0 : this.field4923.compare(arg0, arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
