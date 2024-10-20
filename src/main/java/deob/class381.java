package deob;

import java.util.Iterator;

@ObfuscatedName("os")
public class class381 implements Iterable {

    @ObfuscatedName("os.at")
    public class457 field4388 = new class457();

    @ObfuscatedName("os.an")
    public class457 field4387;

    public class381() {
        this.field4388.field4750 = this.field4388;
        this.field4388.field4749 = this.field4388;
    }

    @ObfuscatedName("os.at()V")
    public void method6449() {
        while (this.field4388.field4750 != this.field4388) {
            this.field4388.field4750.method7554();
        }
    }

    @ObfuscatedName("os.an(Lrh;)V")
    public void method6460(class457 arg0) {
        if (arg0.field4749 != null) {
            arg0.method7554();
        }
        arg0.field4749 = this.field4388.field4749;
        arg0.field4750 = this.field4388;
        arg0.field4749.field4750 = arg0;
        arg0.field4750.field4749 = arg0;
    }

    @ObfuscatedName("os.av(Lrh;Lrh;)V")
    public static void method6451(class457 arg0, class457 arg1) {
        if (arg0.field4749 != null) {
            arg0.method7554();
        }
        arg0.field4749 = arg1;
        arg0.field4750 = arg1.field4750;
        arg0.field4749.field4750 = arg0;
        arg0.field4750.field4749 = arg0;
    }

    @ObfuscatedName("os.as()Lrh;")
    public class457 method6452() {
        class457 var1 = this.field4388.field4750;
        if (this.field4388 == var1) {
            return null;
        } else {
            var1.method7554();
            return var1;
        }
    }

    @ObfuscatedName("os.ax()Lrh;")
    public class457 method6473() {
        return this.method6476((class457) null);
    }

    @ObfuscatedName("os.ap(Lrh;)Lrh;")
    public class457 method6476(class457 arg0) {
        class457 var2;
        if (arg0 == null) {
            var2 = this.field4388.field4750;
        } else {
            var2 = arg0;
        }
        if (this.field4388 == var2) {
            this.field4387 = null;
            return null;
        } else {
            this.field4387 = var2.field4750;
            return var2;
        }
    }

    @ObfuscatedName("os.ab()Lrh;")
    public class457 method6455() {
        class457 var1 = this.field4387;
        if (this.field4388 == var1) {
            this.field4387 = null;
            return null;
        } else {
            this.field4387 = var1.field4750;
            return var1;
        }
    }

    public Iterator iterator() {
        return new class380(this);
    }
}
