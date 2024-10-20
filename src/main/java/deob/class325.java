package deob;

import java.util.Comparator;

@ObfuscatedName("ly")
public abstract class class325 implements Comparator {

    @ObfuscatedName("ly.t")
    public Comparator field3856;

    @ObfuscatedName("ly.o(Ljava/util/Comparator;B)V")
    public final void method5213(Comparator arg0) {
        if (this.field3856 == null) {
            this.field3856 = arg0;
        } else if (this.field3856 instanceof class325) {
            ((class325) this.field3856).method5213(arg0);
        }
    }

    @ObfuscatedName("ly.x(Llm;Llm;I)I")
    public final int method5216(class324 arg0, class324 arg1) {
        return this.field3856 == null ? 0 : this.field3856.compare(arg0, arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
