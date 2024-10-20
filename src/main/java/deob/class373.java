package deob;

import java.util.Comparator;

@ObfuscatedName("ng")
public abstract class class373 implements Comparator {

    @ObfuscatedName("ng.q")
    public Comparator field4326;

    @ObfuscatedName("ng.m(Ljava/util/Comparator;B)V")
    public final void method6015(Comparator arg0) {
        if (this.field4326 == null) {
            this.field4326 = arg0;
        } else if (this.field4326 instanceof class373) {
            ((class373) this.field4326).method6015(arg0);
        }
    }

    @ObfuscatedName("ng.p(Lnb;Lnb;I)I")
    public final int method6016(class372 arg0, class372 arg1) {
        return this.field4326 == null ? 0 : this.field4326.compare(arg0, arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
