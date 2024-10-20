package deob;

import java.util.Iterator;

@ObfuscatedName("gm")
public class class202 implements Iterable {

    @ObfuscatedName("gm.i")
    public class195 field2500 = new class195();

    public class202() {
        this.field2500.field2485 = this.field2500;
        this.field2500.field2486 = this.field2500;
    }

    @ObfuscatedName("gm.i()V")
    public void method3352() {
        while (this.field2500.field2485 != this.field2500) {
            this.field2500.field2485.method3318();
        }
    }

    @ObfuscatedName("gm.c(Lgc;)V")
    public void method3360(class195 arg0) {
        if (arg0.field2486 != null) {
            arg0.method3318();
        }
        arg0.field2486 = this.field2500.field2486;
        arg0.field2485 = this.field2500;
        arg0.field2486.field2485 = arg0;
        arg0.field2485.field2486 = arg0;
    }

    public Iterator iterator() {
        return new class201(this);
    }
}
