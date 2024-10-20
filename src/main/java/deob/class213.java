package deob;

import java.util.Iterator;

@ObfuscatedName("hc")
public class class213 implements Iterable {

    @ObfuscatedName("hc.p")
    public class206 field2581 = new class206();

    public class213() {
        this.field2581.field2566 = this.field2581;
        this.field2581.field2567 = this.field2581;
    }

    @ObfuscatedName("hc.p()V")
    public void method3643() {
        while (this.field2581.field2566 != this.field2581) {
            this.field2581.field2566.method3604();
        }
    }

    @ObfuscatedName("hc.i(Lgf;)V")
    public void method3642(class206 arg0) {
        if (arg0.field2567 != null) {
            arg0.method3604();
        }
        arg0.field2567 = this.field2581.field2567;
        arg0.field2566 = this.field2581;
        arg0.field2567.field2566 = arg0;
        arg0.field2566.field2567 = arg0;
    }

    public Iterator iterator() {
        return new class212(this);
    }
}
