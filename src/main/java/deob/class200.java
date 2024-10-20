package deob;

import java.util.Iterator;

@ObfuscatedName("gc")
public class class200 implements Iterable {

    @ObfuscatedName("gc.k")
    public class204 field3095 = new class204();

    public class200() {
        this.field3095.field3099 = this.field3095;
        this.field3095.field3100 = this.field3095;
    }

    @ObfuscatedName("gc.k()V")
    public void method3612() {
        while (this.field3095.field3099 != this.field3095) {
            this.field3095.field3099.method3649();
        }
    }

    @ObfuscatedName("gc.h(Lgl;)V")
    public void method3607(class204 arg0) {
        if (arg0.field3100 != null) {
            arg0.method3649();
        }
        arg0.field3100 = this.field3095.field3100;
        arg0.field3099 = this.field3095;
        arg0.field3100.field3099 = arg0;
        arg0.field3099.field3100 = arg0;
    }

    public Iterator iterator() {
        return new class206(this);
    }
}
