package deob;

import java.util.Comparator;

@ObfuscatedName("ju")
public abstract class class284 implements Comparator {

    @ObfuscatedName("ju.q")
    public Comparator field3705;

    @ObfuscatedName("ju.g(Ljava/util/Comparator;B)V")
    public final void method4812(Comparator arg0) {
        if (this.field3705 == null) {
            this.field3705 = arg0;
        } else if (this.field3705 instanceof class284) {
            ((class284) this.field3705).method4812(arg0);
        }
    }

    @ObfuscatedName("ju.c(Ljw;Ljw;B)I")
    public final int method4811(class283 arg0, class283 arg1) {
        return this.field3705 == null ? 0 : this.field3705.compare(arg0, arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
