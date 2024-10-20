package deob;

import java.util.Comparator;

@ObfuscatedName("rv")
public abstract class class449 implements Comparator {

    @ObfuscatedName("rv.al")
    public Comparator field4701;

    @ObfuscatedName("rv.am(Ljava/util/Comparator;I)V")
    public final void method7349(Comparator arg0) {
        if (this.field4701 == null) {
            this.field4701 = arg0;
        } else if (this.field4701 instanceof class449) {
            ((class449) this.field4701).method7349(arg0);
        }
    }

    @ObfuscatedName("rv.av(Lrp;Lrp;B)I")
    public final int method7354(class448 arg0, class448 arg1) {
        return this.field4701 == null ? 0 : this.field4701.compare(arg0, arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
