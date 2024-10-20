package deob;

import java.util.Iterator;

@ObfuscatedName("gz")
public class class202 implements Iterable {

    @ObfuscatedName("gz.a")
    public class195 field2485 = new class195();

    public class202() {
        this.field2485.field2471 = this.field2485;
        this.field2485.field2470 = this.field2485;
    }

    @ObfuscatedName("gz.a()V")
    public void method3394() {
        while (this.field2485.field2471 != this.field2485) {
            this.field2485.field2471.method3348();
        }
    }

    @ObfuscatedName("gz.j(Lgn;)V")
    public void method3398(class195 arg0) {
        if (arg0.field2470 != null) {
            arg0.method3348();
        }
        arg0.field2470 = this.field2485.field2470;
        arg0.field2471 = this.field2485;
        arg0.field2470.field2471 = arg0;
        arg0.field2471.field2470 = arg0;
    }

    public Iterator iterator() {
        return new class201(this);
    }
}
