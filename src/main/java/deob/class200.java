package deob;

import java.util.Iterator;

@ObfuscatedName("gs")
public class class200 implements Iterable {

    @ObfuscatedName("gs.o")
    public class204 field3097 = new class204();

    public class200() {
        this.field3097.field3102 = this.field3097;
        this.field3097.field3101 = this.field3097;
    }

    @ObfuscatedName("gs.o()V")
    public void method3607() {
        while (this.field3097.field3102 != this.field3097) {
            this.field3097.field3102.method3645();
        }
    }

    @ObfuscatedName("gs.e(Lge;)V")
    public void method3603(class204 arg0) {
        if (arg0.field3101 != null) {
            arg0.method3645();
        }
        arg0.field3101 = this.field3097.field3101;
        arg0.field3102 = this.field3097;
        arg0.field3101.field3102 = arg0;
        arg0.field3102.field3101 = arg0;
    }

    public Iterator iterator() {
        return new class206(this);
    }
}
