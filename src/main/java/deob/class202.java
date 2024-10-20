package deob;

import java.util.Iterator;

@ObfuscatedName("gr")
public class class202 implements Iterable {

    @ObfuscatedName("gr.p")
    public class195 field2502 = new class195();

    public class202() {
        this.field2502.field2488 = this.field2502;
        this.field2502.field2487 = this.field2502;
    }

    @ObfuscatedName("gr.p()V")
    public void method3320() {
        while (this.field2502.field2488 != this.field2502) {
            this.field2502.field2488.method3285();
        }
    }

    @ObfuscatedName("gr.m(Lgp;)V")
    public void method3321(class195 arg0) {
        if (arg0.field2487 != null) {
            arg0.method3285();
        }
        arg0.field2487 = this.field2502.field2487;
        arg0.field2488 = this.field2502;
        arg0.field2487.field2488 = arg0;
        arg0.field2488.field2487 = arg0;
    }

    public Iterator iterator() {
        return new class201(this);
    }
}
