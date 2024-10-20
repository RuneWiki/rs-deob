package deob;

import java.util.Comparator;

@ObfuscatedName("pl")
public abstract class class405 implements Comparator {

    @ObfuscatedName("pl.al")
    public Comparator field4524;

    @ObfuscatedName("pl.an(Ljava/util/Comparator;I)V")
    public final void method6938(Comparator arg0) {
        if (this.field4524 == null) {
            this.field4524 = arg0;
        } else if (this.field4524 instanceof class405) {
            ((class405) this.field4524).method6938(arg0);
        }
    }

    @ObfuscatedName("pl.av(Lpb;Lpb;I)I")
    public final int method6939(class404 arg0, class404 arg1) {
        return this.field4524 == null ? 0 : this.field4524.compare(arg0, arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
