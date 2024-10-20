package deob;

import java.util.Comparator;

@ObfuscatedName("jq")
public abstract class class275 implements Comparator {

    @ObfuscatedName("jq.f")
    public Comparator field3597;

    @ObfuscatedName("jq.w(Ljava/util/Comparator;I)V")
    public final void method4722(Comparator arg0) {
        if (this.field3597 == null) {
            this.field3597 = arg0;
        } else if (this.field3597 instanceof class275) {
            ((class275) this.field3597).method4722(arg0);
        }
    }

    @ObfuscatedName("jq.i(Ljr;Ljr;B)I")
    public final int method4723(class274 arg0, class274 arg1) {
        return this.field3597 == null ? 0 : this.field3597.compare(arg0, arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
