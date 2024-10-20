package deob;

import java.util.Comparator;

@ObfuscatedName("pz")
public abstract class class409 implements Comparator {

    @ObfuscatedName("pz.an")
    public Comparator field4583;

    @ObfuscatedName("pz.ay(Ljava/util/Comparator;I)V")
    public final void method7182(Comparator arg0) {
        if (this.field4583 == null) {
            this.field4583 = arg0;
        } else if (this.field4583 instanceof class409) {
            ((class409) this.field4583).method7182(arg0);
        }
    }

    @ObfuscatedName("pz.ao(Lpw;Lpw;I)I")
    public final int method7183(class408 arg0, class408 arg1) {
        return this.field4583 == null ? 0 : this.field4583.compare(arg0, arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
