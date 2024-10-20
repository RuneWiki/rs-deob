package deob;

import java.util.Iterator;

@ObfuscatedName("gq")
public class class194 implements Iterable {

    @ObfuscatedName("gq.j")
    public class198 field3029 = new class198();

    public class194() {
        this.field3029.field3033 = this.field3029;
        this.field3029.field3034 = this.field3029;
    }

    @ObfuscatedName("gq.j()V")
    public void method3518() {
        while (this.field3029.field3033 != this.field3029) {
            this.field3029.field3033.method3552();
        }
    }

    @ObfuscatedName("gq.y(Lgt;)V")
    public void method3519(class198 arg0) {
        if (arg0.field3034 != null) {
            arg0.method3552();
        }
        arg0.field3034 = this.field3029.field3034;
        arg0.field3033 = this.field3029;
        arg0.field3034.field3033 = arg0;
        arg0.field3033.field3034 = arg0;
    }

    public Iterator iterator() {
        return new class200(this);
    }
}
