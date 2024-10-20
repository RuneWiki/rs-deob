package deob;

import java.util.Iterator;

@ObfuscatedName("ge")
public class class202 implements Iterable {

    @ObfuscatedName("ge.w")
    public class195 field2484 = new class195();

    public class202() {
        this.field2484.field2469 = this.field2484;
        this.field2484.field2470 = this.field2484;
    }

    @ObfuscatedName("ge.w()V")
    public void method3497() {
        while (this.field2484.field2469 != this.field2484) {
            this.field2484.field2469.method3457();
        }
    }

    @ObfuscatedName("ge.s(Lgp;)V")
    public void method3492(class195 arg0) {
        if (arg0.field2470 != null) {
            arg0.method3457();
        }
        arg0.field2470 = this.field2484.field2470;
        arg0.field2469 = this.field2484;
        arg0.field2470.field2469 = arg0;
        arg0.field2469.field2470 = arg0;
    }

    public Iterator iterator() {
        return new class201(this);
    }
}
