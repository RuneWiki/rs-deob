package deob;

import java.util.Comparator;

@ObfuscatedName("lr")
public abstract class class324 implements Comparator {

    @ObfuscatedName("lr.e")
    public Comparator field3838;

    @ObfuscatedName("lr.r(Ljava/util/Comparator;I)V")
    public final void method5192(Comparator arg0) {
        if (this.field3838 == null) {
            this.field3838 = arg0;
        } else if (this.field3838 instanceof class324) {
            ((class324) this.field3838).method5192(arg0);
        }
    }

    @ObfuscatedName("lr.h(Llf;Llf;B)I")
    public final int method5196(class323 arg0, class323 arg1) {
        return this.field3838 == null ? 0 : this.field3838.compare(arg0, arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
