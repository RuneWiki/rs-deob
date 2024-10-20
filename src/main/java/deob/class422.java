package deob;

import java.util.Comparator;

@ObfuscatedName("qi")
public abstract class class422 implements Comparator {

    @ObfuscatedName("qi.an")
    public Comparator field4602;

    @ObfuscatedName("qi.ab(Ljava/util/Comparator;B)V")
    public final void method7164(Comparator arg0) {
        if (this.field4602 == null) {
            this.field4602 = arg0;
        } else if (this.field4602 instanceof class422) {
            ((class422) this.field4602).method7164(arg0);
        }
    }

    @ObfuscatedName("qi.ak(Lqm;Lqm;I)I")
    public final int method7169(class421 arg0, class421 arg1) {
        return this.field4602 == null ? 0 : this.field4602.compare(arg0, arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
