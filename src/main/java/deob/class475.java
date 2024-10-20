package deob;

import java.util.Comparator;

@ObfuscatedName("se")
public abstract class class475 implements Comparator {

    @ObfuscatedName("se.ae")
    public Comparator field4985;

    @ObfuscatedName("se.au(Ljava/util/Comparator;I)V")
    public final void method8078(Comparator arg0) {
        if (this.field4985 == null) {
            this.field4985 = arg0;
        } else if (this.field4985 instanceof class475) {
            ((class475) this.field4985).method8078(arg0);
        }
    }

    @ObfuscatedName("se.ar(Lss;Lss;B)I")
    public final int method8083(class474 arg0, class474 arg1) {
        return this.field4985 == null ? 0 : this.field4985.compare(arg0, arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
