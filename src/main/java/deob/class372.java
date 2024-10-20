package deob;

import java.util.Comparator;

@ObfuscatedName("nn")
public abstract class class372 implements Comparator {

    @ObfuscatedName("nn.v")
    public Comparator field4312;

    @ObfuscatedName("nn.w(Ljava/util/Comparator;S)V")
    public final void method6091(Comparator arg0) {
        if (this.field4312 == null) {
            this.field4312 = arg0;
        } else if (this.field4312 instanceof class372) {
            ((class372) this.field4312).method6091(arg0);
        }
    }

    @ObfuscatedName("nn.y(Lne;Lne;I)I")
    public final int method6090(class371 arg0, class371 arg1) {
        return this.field4312 == null ? 0 : this.field4312.compare(arg0, arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
