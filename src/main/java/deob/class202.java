package deob;

import java.util.Iterator;

@ObfuscatedName("gt")
public class class202 implements Iterable {

    @ObfuscatedName("gt.i")
    public class195 field2486 = new class195();

    public class202() {
        this.field2486.field2472 = this.field2486;
        this.field2486.field2471 = this.field2486;
    }

    @ObfuscatedName("gt.i()V")
    public void method3438() {
        while (this.field2486.field2472 != this.field2486) {
            this.field2486.field2472.method3403();
        }
    }

    @ObfuscatedName("gt.h(Lga;)V")
    public void method3439(class195 arg0) {
        if (arg0.field2471 != null) {
            arg0.method3403();
        }
        arg0.field2471 = this.field2486.field2471;
        arg0.field2472 = this.field2486;
        arg0.field2471.field2472 = arg0;
        arg0.field2472.field2471 = arg0;
    }

    public Iterator iterator() {
        return new class201(this);
    }
}
