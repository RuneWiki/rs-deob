package deob;

import java.util.Iterator;

@ObfuscatedName("gw")
public class class200 implements Iterable {

    @ObfuscatedName("gw.d")
    public class204 field3091 = new class204();

    public class200() {
        this.field3091.field3096 = this.field3091;
        this.field3091.field3095 = this.field3091;
    }

    @ObfuscatedName("gw.d()V")
    public void method3642() {
        while (this.field3091.field3096 != this.field3091) {
            this.field3091.field3096.method3680();
        }
    }

    @ObfuscatedName("gw.p(Lgt;)V")
    public void method3644(class204 arg0) {
        if (arg0.field3095 != null) {
            arg0.method3680();
        }
        arg0.field3095 = this.field3091.field3095;
        arg0.field3096 = this.field3091;
        arg0.field3095.field3096 = arg0;
        arg0.field3096.field3095 = arg0;
    }

    public Iterator iterator() {
        return new class206(this);
    }
}
