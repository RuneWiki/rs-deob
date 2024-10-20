package deob;

import java.util.Iterator;

@ObfuscatedName("go")
public class class202 implements Iterable {

    @ObfuscatedName("go.n")
    public class195 field2502 = new class195();

    public class202() {
        this.field2502.field2487 = this.field2502;
        this.field2502.field2488 = this.field2502;
    }

    @ObfuscatedName("go.n()V")
    public void method3431() {
        while (this.field2502.field2487 != this.field2502) {
            this.field2502.field2487.method3391();
        }
    }

    @ObfuscatedName("go.p(Lgu;)V")
    public void method3430(class195 arg0) {
        if (arg0.field2488 != null) {
            arg0.method3391();
        }
        arg0.field2488 = this.field2502.field2488;
        arg0.field2487 = this.field2502;
        arg0.field2488.field2487 = arg0;
        arg0.field2487.field2488 = arg0;
    }

    public Iterator iterator() {
        return new class201(this);
    }
}
