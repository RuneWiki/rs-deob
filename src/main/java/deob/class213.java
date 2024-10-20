package deob;

import java.util.Iterator;

@ObfuscatedName("hk")
public class class213 implements Iterable {

    @ObfuscatedName("hk.s")
    public class206 field2604 = new class206();

    public class213() {
        this.field2604.field2590 = this.field2604;
        this.field2604.field2589 = this.field2604;
    }

    @ObfuscatedName("hk.s()V")
    public void method3818() {
        while (this.field2604.field2590 != this.field2604) {
            this.field2604.field2590.method3781();
        }
    }

    @ObfuscatedName("hk.g(Lgv;)V")
    public void method3819(class206 arg0) {
        if (arg0.field2589 != null) {
            arg0.method3781();
        }
        arg0.field2589 = this.field2604.field2589;
        arg0.field2590 = this.field2604;
        arg0.field2589.field2590 = arg0;
        arg0.field2590.field2589 = arg0;
    }

    public Iterator iterator() {
        return new class212(this);
    }
}
