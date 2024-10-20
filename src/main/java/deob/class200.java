package deob;

import java.util.Iterator;

@ObfuscatedName("gd")
public class class200 implements Iterable {

    @ObfuscatedName("gd.l")
    public class204 field3091 = new class204();

    public class200() {
        this.field3091.field3096 = this.field3091;
        this.field3091.field3095 = this.field3091;
    }

    @ObfuscatedName("gd.l()V")
    public void method3570() {
        while (this.field3091.field3096 != this.field3091) {
            this.field3091.field3096.method3603();
        }
    }

    @ObfuscatedName("gd.e(Lgz;)V")
    public void method3569(class204 arg0) {
        if (arg0.field3095 != null) {
            arg0.method3603();
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
